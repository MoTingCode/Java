/*
接口：初期理解，可以认为是一个特设的抽象类
      当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示
class用于定义类
interface用于定义接口

接口定义时格式特点：
1、接口中常见定义：常量，抽象方法。
2、接口中的成员都有固定修饰符。
    常量：public static final
	方法：public abstract
记住：接口中的成员都是public的。

接口是不可以创建对象的，因为有抽象方法，需要被子类实现，子类对接口中的抽象方法全部覆盖后，
子类才可以实例化，否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式，java支持多实现。

*/

interface Inter
{
	public static final int NUM = 3 ;
	public abstract void show() ;
}

interface Inter1
{
	public abstract void method() ;
}

class Demo
{
	public void function(){}
}

class Test extends Demo implements Inter,Inter1  //一个类可以在继承一个类的同时，还可以实现很多接口。
{
	public void show(){}
	public void method(){}

}

interface A
{
	void methodA() ;
}

interface B //extends A  
{
	void methodB() ;
}

interface C extends B,A //接口可以继承接口，并且可以多继承
{
	void methodC() ;
}

class D implements C //如果类D实现了接口C，那么类D需要覆盖ABC每个接口中的函数。
{
	public void methodA(){} ;
	public void methodB(){} ;
	public void methodC(){} ;


}

class test
{
	public static void main(String[] args) 
	{
		Test t = new Test() ;
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);

	}
}
