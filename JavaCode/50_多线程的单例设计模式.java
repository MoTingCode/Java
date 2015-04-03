
/*
单例设计模式。


*/
//饿汉式。
/*
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/


//懒汉式
/*
懒汉式特点在于实例的延迟加载
但是在多线程访问时会出现安全问题
可以加同步来解决，用同步代码块和同步函数都行，但是稍微有些低效，
用双重判断的形式能解决判断问题，
加同步时，使用的锁是该类所属的字节码文件对象
*/
class Single
{
	private static Single s = null;
	private Single(){}


	public static  Single getInstance()
	{
		if(s == null)  
		{
			synchronized(Single.class)
			{
				if(s==null)
					s = new Single() ;
				return s;
			}
		}
	/*   
			synchronized(Single.class)  //如果是这样，去掉了if(s == null)，会产生低效问题，
			{                           //因为每次有线程进入都会上锁，然后判断s==null。
				if(s==null)
					s = new Single() ;
				return s;
			}

	*/
	}
}

class SingleDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
