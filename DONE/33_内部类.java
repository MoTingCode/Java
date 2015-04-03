/*
内部类访问规则：
1、内部类可以直接访问外部类中的成员，包括私有。之所以可以直接访问外部类中的成员，
   是因为内部类中持有了一个外部类的应用，格式：外部类名.this
2、外部类要访问内部类，必须建立内部类对象。

访问格式：
 1、当内部类定义在外部类的成员位置上，而且非私有。在外部其他类（class test类）中，可以直接建立内部类对象，
格式：  外部类名.内部类名 变量名 = 外部类对象.内部类对象 ;
        Outer.Inner in = new Outer().new Inner() ; 
 2、当内部类在成员位置上，就可以被成员修饰符所修饰。
    比如，private：将内部类在外部类中进行封装。
	      static：内部类就具备了静态的特性。当内部类被static修饰后，只能访问直接访问外部类中的static成员，出现了访问局限。

	在外部其他类（class test类）中，如何直接访问static内部类的非静态成员呢？
	new Outer.Inner().function() ;
	在外部其他类中，如何直接访问static内部类的静态成员呢？
	Outer.Inner.function() ;
注意：当内部类中定义了静态成员，该内部类必须是static的。
      当外部类中的静态放啊访问内部类时，内部类也必须是静态的。

内部类用法：
	当描述事物时，事物的内部还有实物，该事物用内部类来描述，并且内部事物在使用外部事物的内容。

 
*/
class Outer
{
	int x = 1 ;
	static int y = 2 ;
	class Inner  //内部类
	{
		int x = 2 ;
		void function()
		{
			int x = 3 ;
			System.out.println("Inner:"+x) ;  //x=3  如果没有定义int x = 2,int x = 3那么这一句也可以访问外部类中的x=1，因为省略了Outer.this.
			System.out.println("Inner:"+this.x) ;  //x=2
			System.out.println("Inner:"+Outer.this.x) ;//x=1 用于访问外部类的x.

		}
	}

	static class Inner2
	{	
		void function()
		{
	//		System.out.println("Inner:"+x) ;  //static内部类，只能访问外部类的static成员,x是非static的，所以这一句错误
			System.out.println("Inner:"+y) ;  //y是static的可以访问
		}
	}

	void method()
	{
		Inner in = new Inner() ;
		in.function() ;
	}
}


class test
{
	public static void main(String[] args) 
	{
	/*	Outer out = new Outer() ;
		out.method() ;
	*/
/*
	Outer.Inner in = new Outer().new Inner() ;  //内部类的直接访问方式
	in.function() ;
*/
	
/*	Outer.Inner2 in = new Outer().new Inner2() ;  //static内部类，只能访问外部类的static成员
	in.function() ;
*/
/*	new Outer.Inner2().function() ; //Inner2是static的，当外部类Outer一加载，内部类就存在了，所以类名Outer可以直接调用Inner，但是function是非static的，必须通过一个对象来调用，所以需要new一个对象来调用function。
	Outer.Inner2().function() ; //若将function也定义为static的，那么这样访问。
*/
	
	}

}
