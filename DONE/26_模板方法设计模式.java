/*
需求：获取一段程序运行的时间。
原理：获取程序开始和结束的时间并相减。

获取时间：System.currentTimeMillis() ;

这种方式叫做：模板方法设计模式。
解释：就是在定义功能时，功能的一部分是确定的，但是有一部分是不确定的，而确定的部分在使用不确定的部分，
那么这时就将不确定的部分暴露出去，由该类的子类去完成。
*/
abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis() ;
		
		runcode() ;
		long end = System.currentTimeMillis() ;
		System.out.println(start) ;
		System.out.println(end) ;
		System.out.println("毫秒："+(end-start)) ;
	}
	public abstract void runcode() ;     //父类不知道子类要测试什么代码的运行时间，所以讲此方法设置为抽象方法，由子类复写。
}


class SubTime extends GetTime
{
	public void runcode()     //子类复写这个方法，加入要测试的代码。
	{
		for(int x = 0; x < 1000; x++)
			System.out.println(x) ;
	}
}
class  TemplateDemo
{
	public static void main(String[] args) 
	{
		SubTime gt = new SubTime() ;
		gt.getTime() ;
	}
}
