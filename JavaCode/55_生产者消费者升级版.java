/*
JDK1.5 中提供了多线程升级解决方案。
将同步Synchronized替换成现实Lock操作。
将Object中的wait，notify notifyAll，替换了Condition对象。
Condition对象可以通过Lock锁进行获取。
该示例中，实现了本方只唤醒对方操作。

Lock:替代了Synchronized
	lock 
	unlock
	newCondition()

Condition：替代了Object wait notify notifyAll
	await();
	signal();
	signalAll();
*/
import java.util.concurrent.locks.*;

class  ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		Resource r = new Resource() ;

		Producer pro = new Producer(r) ;
		Consumer con = new Consumer(r) ;

		Thread t1 = new Thread(pro) ;
		Thread t2 = new Thread(pro) ;
		Thread t3 = new Thread(con) ;
		Thread t4 = new Thread(con) ;

		t1.start() ;
		t2.start() ;
		t3.start() ;
		t4.start() ;
	}
}


class Resource
{
	private String name ; //产品名称
	private int count = 1 ; //产品编号
	private boolean flag = 	false ; //互斥变量

	private Lock lock = new ReentrantLock() ; //创建一个Lock索对象
	
	private Condition condition_pro = lock.newCondition() ; //通过Lock锁对象获取Condition对象
	private Condition condition_con = lock.newCondition() ; //同一个Lock锁对象可以绑定很多Condition对象，每个Condition对象都有自己的await和signal操作，可以指定await和signal操作的对象。

	public void set(String name)throws InterruptedException
	{
		lock.lock() ; //上锁，对应解锁 lock.unlock() ;
		try
		{
			while(flag)  
				condition_pro.await() ;
			this.name = name+"--"+count++ ;
			
			System.out.println(Thread.currentThread().getName() + "...生产者.." + this.name) ;
			flag = true ;
			condition_con.signal() ;
		}
		finally
		{
			lock.unlock() ; //解锁
		}	
	}

	public void out()throws InterruptedException
	{
		lock.lock() ;
		try
		{
			while(!flag)
				condition_con.await() ;
			System.out.println(Thread.currentThread().getName() + "...消费者..........." + this.name) ;		
			flag = false ;
			condition_pro.signal() ;
		}
		finally
		{
			lock.unlock() ;
		}
		

	}
}

class Producer implements Runnable
{
	private Resource res ;

	Producer(Resource res)
	{
		this.res = res ;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				res.set("+商品+") ;
			}
			catch (InterruptedException e)
			{
			}
			
		}
	}
}

class Consumer implements Runnable
{
	private Resource res ;

	Consumer(Resource res)
	{
		this.res = res ;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				res.out() ;
			}
			catch (InterruptedException e)
			{
			}
			
		}
	}
}