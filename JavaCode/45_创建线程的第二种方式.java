
/*
需求：简单的卖票程序。
多个窗口同时买票。


创建线程的第二种方式：实现Runable接口

步骤：
1，定义类实现Runnable接口
2，覆盖Runnable接口中的run方法。
	将线程要运行的代码存放在该run方法中。

3，通过Thread类建立线程对象。
4，将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
	为什么要将Runnable接口的子类对象传递给Thread的构造函数。
	因为，自定义的run方法所属的对象是Runnable接口的子类对象。
	所以要让线程去执行指定对象的run方法。就必须明确该run方法所属对象。


5，调用Thread类的start方法开启线程并调用Runnable接口子类的run方法。



Runnable实现方式和继承方式有什么区别呢？

Runnable实现方式好处：避免了单继承的局限性。
在定义线程时，建立使用实现方式。

两种方式区别：
继承Thread:线程代码存放Thread子类run方法中。
实现Runnable：线程代码存在接口的子类的run方法。
*/

class Ticket implements Runnable
{
	private  int tick = 100; //tick是类成员变量，被由一个Ticket类的对象创建的多个线程所共享
	public void run()
	{
		//int tick = 100 ; //此时，每一个线程都会拥有自己的一份局部变量，线程之间互不影响
		while(true)
		{
			if(tick>0)
			{
				System.out.println(Thread.currentThread().getName()+"....sale : "+ tick--);
			}
		}
	}
}


class  TicketDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();//这个对象不是线程，因为它和Thread类没有关系
								//tick是类成员变量，Ticket的对象t只包含一个tick，下面的4个Thread对象由t创建，所以共享了t的一个tick
		Thread t1 = new Thread(t);//创建了一个线程；
		Thread t2 = new Thread(t);//创建了一个线程；
		Thread t3 = new Thread(t);//创建了一个线程；
		Thread t4 = new Thread(t);//创建了一个线程；
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
