/*
当多个类中出现了相同的功能，但是功能主体不同，这时可以进行向上抽取。
这时，只抽取功能定义，而不抽取功能主体。

抽象：看不懂

抽象类特点：
1、抽象方法一定在抽象类中。
2、抽象方法和抽象类都必须被abstract关键字修饰。
3、抽象类不可以用new创建对象，因为调用抽象方法没有意义。
4、抽象类中的抽象方法要想被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
   如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。

抽象类和一般类没有太大的不同，该如何描述事物，就如何描述事物，只不过该事物出现了一些看不懂
的东西。这些不确定的部分，也是该事物的功能，需要明确出现，但是无法定义主体。通过抽象方法来表示。

抽象类比一般类多了抽象函数，就是在类中可以定义抽象方法，抽象类不可以实例化。

特殊：抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象。
*/

abstract class Student
{
	abstract void study1() ;
	//abstract void study2() ;  //若这句存在，并且BaseStudent类中只复写了study1方法而没有复写study2方法，那么，BaseStudent类还是一个抽象类。
	                            //只有将父类的所有抽象方法全部复写，才可以不是抽象类。
}


class BaseStudent extends Student
{
	void study1()
	{
		System.out.println("study") ;
	}

}
class AdvStudent extends Student
{
	void study1()
	{
		System.out.println("study") ;
	}
}


class AbstractDemo 
{
	public static void main(String[] args) 
	{
		new BaseStudent().study1() ;
	}
}
