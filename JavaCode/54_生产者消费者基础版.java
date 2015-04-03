/*
对于多个生产者和消费者。
为什么要定义while判断标记。
原因：让被唤醒的线程再一次判断标记。


为什么定义notifyAll，
因为需要唤醒对方线程。
因为只用notify，容易出现只唤醒本方线程的情况。导致程序中的所有线程都等待。

*/



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

	public synchronized void set(String name)
	{
		while(flag)  //此处必须用while循环，使在while循环内被唤醒的进程再次判断标记
			try{wait() ;}catch(Exception e){}
		this.name = name+"--"+count++ ;
		System.out.println(Thread.currentThread().getName() + "...生产者.." + this.name) ;
		
		flag = true ;
		this.notifyAll() ;//如果此处是norify，那么会产生全部等待的现象，
		                  //因为生产者可能会唤醒另一个生产者进程，从而导致被唤醒的生产者
						  //进程被卡在while循环处，造成所有线程等待
						  //换成notifyAll，则可以保证有消费者进程被唤醒
	}

	public synchronized void out()
	{
		while(!flag)
			try{wait() ;}catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "...消费者..........." + this.name) ;		
		
		flag = false ;
		this.notifyAll() ;
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
			res.set("+商品+") ;
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
			res.out() ;
		}
	}
}