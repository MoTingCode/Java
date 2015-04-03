/*
将学生工人的共性抽取出来，构成Person类，学生和工人继承Person类

继承：
1、提高代码的复用性
2、让类与类之间产生关系，有了这种关系，才有了多态。

java 语言中：java只支持单继承，不继承多继承，因为多继承容易带来安全隐患。
当多个父类中定义了相同的功能，当功能内容不同时，子类对象不确定要运行哪一个。
但是java保留了这种机制，并用另一种形式来完成：多实现。

java支持多层继承，也就是一个继承体系，如何使用一个继承体系中的功能？
想要使用体系，先查阅体系中父类的描述，因为父类中定义的是该体系中的共性功能，通过了解共性功能，
就可以知道该体系的基本功能，那么这个体系就可以基本使用了。在具体使用时，要创建最子类的对象，因为：
1、因为有可能父类不让你创建对象。
2、创建子类对象可以使用更多的功能，包括基本的，也包括特有的。
总之：查阅父类功能，创建子类对象使用功能。

聚集：包括聚合、组合。

聚合：

组合：

*/
class Person
{
	String name ;
	int age ;
}

class Student extends Person
{
	void study()
	{
		System.out.println("styde!") ;
	}

}
class Worker extends Person
{
	void work()
	{
		Sysrem.out.println("work!") ;
	}

}

class  test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
