/*
JDK1.5 ���ṩ�˶��߳��������������
��ͬ��Synchronized�滻����ʵLock������
��Object�е�wait��notify notifyAll���滻��Condition����
Condition�������ͨ��Lock�����л�ȡ��
��ʾ���У�ʵ���˱���ֻ���ѶԷ�������

Lock:�����Synchronized
	lock 
	unlock
	newCondition()

Condition�������Object wait notify notifyAll
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
	private String name ; //��Ʒ����
	private int count = 1 ; //��Ʒ���
	private boolean flag = 	false ; //�������

	private Lock lock = new ReentrantLock() ; //����һ��Lock������
	
	private Condition condition_pro = lock.newCondition() ; //ͨ��Lock�������ȡCondition����
	private Condition condition_con = lock.newCondition() ; //ͬһ��Lock��������԰󶨺ܶ�Condition����ÿ��Condition�������Լ���await��signal����������ָ��await��signal�����Ķ���

	public void set(String name)throws InterruptedException
	{
		lock.lock() ; //��������Ӧ���� lock.unlock() ;
		try
		{
			while(flag)  
				condition_pro.await() ;
			this.name = name+"--"+count++ ;
			
			System.out.println(Thread.currentThread().getName() + "...������.." + this.name) ;
			flag = true ;
			condition_con.signal() ;
		}
		finally
		{
			lock.unlock() ; //����
		}	
	}

	public void out()throws InterruptedException
	{
		lock.lock() ;
		try
		{
			while(!flag)
				condition_con.await() ;
			System.out.println(Thread.currentThread().getName() + "...������..........." + this.name) ;		
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
				res.set("+��Ʒ+") ;
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