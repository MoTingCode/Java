/*
����ĳһ�࣬�̳�
���������Ĺ��ܣ��ӿ�ʵ��
*/



abstract class Student
{
	abstract void study() ;
	void sleep()
	{
		System.out.println("sleep") ;
	}
}

interface Smoking
{
	void smoke() ;
}

interface drink()
{
	void drink() ;
}
class ZhangSan extends Student implements Smoking,drink
{
	void study(){}
	public void smoke(){} ;
	public void drink(){} ;
}

class Lisi extends Student
{
}

class  test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
