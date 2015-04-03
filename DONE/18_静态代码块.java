/*
静态代码块
格式：      static
			{
				静态代码块中的执行语句。
			}
特点：随着类的加载而执行，只执行一次,并优先于main函数
用于给类进行初始化。
类的加载包括：
           new StaticCode() ;
		   StaticCode.show() ;
        而 StaticCode s = null ;不属于类的加载，只有当 StaticCode s = new StaticCode();时，类才会加载。
*/
class  StaticCode
{
	int num = 9 ;
	StaticCode()
	{
		System.out.println("b")
	}
	/*构造函数给指定对象初始化*/
	StaticCode(int a)
	{
		num = a ;
	}
	/*静态代码块,给类初始化*/
	static	
	{
		System.out.print("a") ;
	}
	
	/*构造代码块，给对象初始化*/
	{
		System.out.println("c") ;
	}
	
	public static void show()
	{
		System.out.println("fuck") ;
	}
}
class StaticDemo
{
	static
	{
		System.out.print("d") ;
	}
	
	public static void main(String[] args) 
	{
		//new StaticCode()
		System.out.print("over");
	}
	
	static
	{
		System.out.print("c") ;
	}
}
//程序的结果为 b c a over
