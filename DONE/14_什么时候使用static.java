/*
什么时候使用静态？从两种情况考虑，因为静态修饰的内容有成员变量和函数。
1、什么时候定义静态变量（类变量）？
当对象中出现共享数据时，该数据被静态所修饰，对象中的特有数据要定义成非静态，存在于堆内存中。

2、什么时候定义静态函数？
当功能内部没有访问到非静态数据（对象的特有数据），那么该功能可以定义成静态的。
*/
class Person
{
	String name;
	static String country = "cn";
	public  static void show()
	{
		System.out.println(contry+"haha");	
	}

}


class  test
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.show();
		//Person .show();
	}

}