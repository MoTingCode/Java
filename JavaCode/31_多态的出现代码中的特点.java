/*
6、多态的出现代码中的特点
	1、在多态中成员函数（非static）的特点（当父类指向子类对象时）：
		                                            在编译时期，参阅引用型变量所属的类中是否有调用的方法，如果有，编译通过，如果没有，编译失败。
													在运行时期，参阅对象所属的类中是否有调用的方法。
    简单总结：成员函数在多态调用时，编译看左边，运行看右边。

	对于static成员函数来讲：无论编译和运行，都参考左边。

    2、在多态中成员变量的特点：
	无论编译和运行，都参考左边（引用型变量所属的类）。
*/

class Fu
{
	void method1()
	{
		System.out.println("fu method1") ;	
	}
	void method2()
	{
		System.out.println("fu method2") ;	
	}
	static void method4()
	{
		System.out.println("fu method4") ;	
	}
}

class Zi extends Fu
{
	void method1()
	{
		System.out.println("zi method1") ;
	}
	void method3()
	{
		System.out.println("zi method3") ;	
	}
	static void method4()
	{
		System.out.println("zi method4") ;	
	}

}
class  test
{
	public static void main(String[] args) 
	{
	/*	Zi z = new Zi() ;
		z.method1() ;  //把Fu的1覆盖了
		z.method2() ;  //子类继承了
		z.method3() ;  //子类特有
	*/
	/*	Fu f = new Zi() ;
		
		f.method1() ;  //结果为zi method1,因为最终在内存中执行的是对象，运行的是Zi类对象中的method2方法。
		f.method2() ;
		//f.method3() ; //这一句是编译失败的，因为：在编译时期，参阅引用型变量所属的类中是否有调用的方法，如果有，编译通过，如果没有，编译失败。
      */                  //f是Fu类型的，Fu类型中没有method3方法。
		Fu f1 = new Zi() ;
		f1.method4() ;   //结果为fu method4 static成员函数来讲：无论编译和运行，都参考左边。因为static进入共享区的静态区中，先于对象存在。
	}
}
