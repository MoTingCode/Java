/*
��ϰ�����������̣߳������߳̽�������

ԭ���̶߳����Լ�Ĭ�ϵ����ƣ�Thread-��ţ��ñ�Ŵ�0��ʼ

static Thread currentThread():��ȡ��ǰ�̶߳���
getName(): ��ȡ�߳����ơ�

�����߳����ƣ�setName���߹��캯����
*/
class Test extends Thread 
{
	Test(String name)
	{
		super(name) ; //���ø���Ĺ��췽��
	}
	public void run()
	{
		for(int x = 0; x < 60; x++)
		{
			System.out.println((Thread.currentThread()==this)+this.getName() + "  run..." + x) ; //getName()��ȡ�̵߳�����
		}
	}
}
class ThreadTest
{
	public static void main(String[] args) 
	{
		Test t1 = new Test("one") ;
		Test t2 = new Test("two") ;
		t1.start() ;
		t2.start() ;
		for (int x = 0; x < 60; x++)
		{
			System.out.println("main run..." + x);
		}
	}
}
