
/*
ͬ�������õ�����һ�����أ�
������Ҫ��������á���ô��������һ�������������á�����this������this�ڵ���ͬ������
����ͬ������ʹ�õ�����this��

ͨ���ó��������֤��

ʹ�������߳�����Ʊ��
һ���߳���ͬ��������С�
һ���߳���ͬ�������С�
����ִ����Ʊ������



*/
class Ticket implements Runnable
{
	private  int tick = 100;
	boolean flag = true ;	 
	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(obj) //ͬ��������õ�����obj����ʱͬ�������������ͬ�������õĲ���ͬһ��������������⣨����0��Ʊ��������obj��Ϊthis����ôͬ��������õ���Ҳ��this����ô�����߳���ͬһ�������Ͳ���������⡣
				{
					if(tick>0)
					{
						try{Thread.sleep(10);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"....code : "+ tick--);
					}
				}
			}
		}
		else
			while(true)
				show() ;   //ʵ������this.show()
	}

	public synchronized void show()//this
	{
		if(tick>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"....show.... : "+ tick--);
		}
	}
}


class  ThisLockDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(Exception e){} 
		t.flag = false ;
		t2.start();
//		Thread t3 = new Thread(t);
//		Thread t4 = new Thread(t);
//		t3.start();
//		t4.start();


	}
}

