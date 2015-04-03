class  test
{
	public static void main(String[] args) 
	{
		Person p1 = new Person() ;
		Person p2 = new Person("lisi") ;
		Person p3 = new Person("wangwu", 10) ;
	}
}

class Person
{
	private String name ;
	private int age ;

	Person()
	{
		System.out.println("A:name="+name+",,age="+age) ;
	}
	Person(String n)
	{
		name = n ;
		System.out.println("B:name="+name+",,age="+age) ;
	}
	Person(String n, int a)
	{

		name = n ;
		age = a ;
		System.out.println("C:name="+name+",,age="+age) ;

	}
	
}