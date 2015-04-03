class  test
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(3) ;
		Person p2 = new Person("lisi") ;
		Person p3 = new Person("wangwu", 10) ;
	}
}

class Person
{
	private String name ;
	private int age ;
	/*
	构造代码块
	作用：给对象进行初始化，对象一建立就运行，而且优先于构造函数执行。
	和构造函数区别：构造代码块是给所有对象进行统一初始化，而构造函数是给对应的对象初始化。
	
	构造代码块中定义的是不同对象共性的初始化内容
	*/
/*	{
		Cry() ;
		//System.out.println("fuck you") ;
	}
*/
	Person(int age)
	{
		this.age = age ;
		speak() ;
	}

	/*
	this:用于区分局部变量和成员变量同名的情况。
	this为什么可以解决这个问题？
	this到底代表什么？代表类的某一个对象。this.name代表某一对象的成员变量name。
	this代表它所在函数所属对象的引用。简单说，哪个对象调用this所在的函数，this就代表哪个对象。
	this的应用：当定义类中成员函数时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。因为在定义类的函数时还没有产生对象，用this代替。
	
	*/
	Person(String name)
	{
		this.name = name ;    //若这一句改为name = name ；那么构造函数参数列表中声明的name会掩盖成员变量name
		speak() ;             //导致传入的参数那么无法赋给成员变量name，而this.name表示某一对象成员变量的name。
	}
	Person(String name, int age)
	{

		this.name = name ;   //这一句也可以写为：this(name);  这是this语句（注意中间没有点），用于构造函数之间进行互相调用
	                         //this(name)实际上是调用的第一个构造函数：Person(String name)
                             //this语句只能放在构造函数的第一行。因为初始化动作要先执行。
		this.age = age ;     
		speak() ;

	}
	public void Cry()
	{
		System.out.println("Cry....") ;
	}
	public void speak()
	{
		System.out.println("name="+this.name+",age="+this.age) ;//去掉this也可以，加上更能说明问题，写上阅读上更好，去掉无所谓。
	}

	/*
	给人定义一个用于比较年龄是否相同的功能
	*/
	public boolean compare(Person p)
	{
		return this.age == p.age ;
	}
}