/*
练习：创建两个线程，和主线程交替运行

原来线程都有自己默认的名称：Thread-编号，该编号从0开始

static Thread currentThread():获取当前线程对象。
getName(): 获取线程名称。

设置线程名称：setName或者构造函数。
*/
class Test extends Thread 
{
	Test(String name)
	{
		super(name) ; //调用父类的构造方法
	}
	public void run()
	{
		for(int x = 0; x < 60; x++)
		{
			System.out.println((Thread.currentThread()==this)+this.getName() + "  run..." + x) ; //getName()获取线程的名称
		}
	}
}
class ThreadTest
{
	public static void main(String[] args) 
	{
		Test t1 = new Test("one") ;
		Test t2 = new Test("two") ;
		t1.start() ;
		t2.start() ;
		for (int x = 0; x < 60; x++)
		{
			System.out.println("main run..." + x);
		}
	}
}
