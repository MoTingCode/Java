/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����
      ���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ
class���ڶ�����
interface���ڶ���ӿ�

�ӿڶ���ʱ��ʽ�ص㣺
1���ӿ��г������壺���������󷽷���
2���ӿ��еĳ�Ա���й̶����η���
    ������public static final
	������public abstract
��ס���ӿ��еĳ�Ա����public�ġ�

�ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷�����Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�
����ſ���ʵ����������������һ�������ࡣ

�ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��java֧�ֶ�ʵ�֡�

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

class Test extends Demo implements Inter,Inter1  //һ��������ڼ̳�һ�����ͬʱ��������ʵ�ֺܶ�ӿڡ�
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

interface C extends B,A //�ӿڿ��Լ̳нӿڣ����ҿ��Զ�̳�
{
	void methodC() ;
}

class D implements C //�����Dʵ���˽ӿ�C����ô��D��Ҫ����ABCÿ���ӿ��еĺ�����
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
