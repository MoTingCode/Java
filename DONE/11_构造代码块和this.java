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
	��������
	���ã���������г�ʼ��������һ���������У����������ڹ��캯��ִ�С�
	�͹��캯�����𣺹��������Ǹ����ж������ͳһ��ʼ���������캯���Ǹ���Ӧ�Ķ����ʼ����
	
	���������ж�����ǲ�ͬ�����Եĳ�ʼ������
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
	this:�������־ֲ������ͳ�Ա����ͬ���������
	thisΪʲô���Խ��������⣿
	this���״���ʲô���������ĳһ������this.name����ĳһ����ĳ�Ա����name��
	this���������ں���������������á���˵���ĸ��������this���ڵĺ�����this�ʹ����ĸ�����
	this��Ӧ�ã����������г�Ա����ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ���������Ϊ�ڶ�����ĺ���ʱ��û�в���������this���档
	
	*/
	Person(String name)
	{
		this.name = name ;    //����һ���Ϊname = name ����ô���캯�������б���������name���ڸǳ�Ա����name
		speak() ;             //���´���Ĳ�����ô�޷�������Ա����name����this.name��ʾĳһ�����Ա������name��
	}
	Person(String name, int age)
	{

		this.name = name ;   //��һ��Ҳ����дΪ��this(name);  ����this��䣨ע���м�û�е㣩�����ڹ��캯��֮����л������
	                         //this(name)ʵ�����ǵ��õĵ�һ�����캯����Person(String name)
                             //this���ֻ�ܷ��ڹ��캯���ĵ�һ�С���Ϊ��ʼ������Ҫ��ִ�С�
		this.age = age ;     
		speak() ;

	}
	public void Cry()
	{
		System.out.println("Cry....") ;
	}
	public void speak()
	{
		System.out.println("name="+this.name+",age="+this.age) ;//ȥ��thisҲ���ԣ����ϸ���˵�����⣬д���Ķ��ϸ��ã�ȥ������ν��
	}

	/*
	���˶���һ�����ڱȽ������Ƿ���ͬ�Ĺ���
	*/
	public boolean compare(Person p)
	{
		return this.age == p.age ;
	}
}