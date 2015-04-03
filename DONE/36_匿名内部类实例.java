interface Inter
{
	void method() ;
}

class Test
{
/*
	static class Inner implements inter   //内部类
	{
		public void method()
		{
			System.out.println("method run") ;
		}
	}
*/
	static Inter function()
	{
		return new Inter()   //匿名内部类
		{
			public void method()
			{
				System.out.println("haha") ;
			}
		} ;
	}

}

class InnerClassTest  
{
	public static void main(String[] args) 
	{
		//Test.function()   Test类中有一个静态的方法function。
		//.method()         function这个方法运算后的结果是一个对象。而且是一个Inter类型的对象。
		//因为只有是Inter类型的对象，才可以调用method方法。
		Test.function().method() ;
		                           //Inter in = Test.function();
		                           //in.method();

		show(new Inter()            //这时调用下面的show方法
		{
			public void method()
			{
				System.out.println("method show run");
			}
		});
		
	}
	public static void show(Inter in)  //show方法
	{
		in.method();
	}
}
