/*
死锁。
同步中嵌套同步。

*/
/*
class Ticket implements Runnable
{
	private  int tick = 1000;
	Object obj = new Object();
	boolean flag = true;
	public  void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(obj)
				{
					show();
				}
			}
		}
		else
			while(true)
				show();
	}
	public synchronized void show()//this
	{
		synchronized(obj)
		{
			if(tick>0)
			{
				try{Thread.sleep(10);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"....code : "+ tick--);
			}
		}
	}
}


class  DeadLockDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();


	}
}
*/

class Test implements Runnable
{
	private boolean flag ;
	Test(boolean flag)
	{
		this.flag = flag ;
	}

	public void run()
	{
		if(flag)
		{
			synchronized(MyLock.locka)
			{
				System.out.println("if lcoka") ;
				synchronized(MyLock.lockb)
				{
					System.out.println("if lockb") ;
				}
			}
		}
		else 
		{
			synchronized(MyLock.lockb)
			{
				System.out.println("else lockb") ;
				synchronized(MyLock.locka)
				{
					System.out.println("else locka") ;
				}
			}
		}
			
	}
}

class MyLock
{
	static Object locka = new Object() ;
	static Object lockb = new Object() ;
}

class DeadLockTest
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Test(true)) ;
		Thread t2 = new Thread(new Test(false)) ;
		
		t1.start() ;
		t2.start() ;
	}
}