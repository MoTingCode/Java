/*
���󣺼򵥵���Ʊ����
�������ͬʱ��Ʊ��


�����̵߳ĵڶ��ַ�ʽ��ʵ��Runable�ӿ�

���裺
1��������ʵ��Runnable�ӿ�
2������Runnable�ӿ��е�run������
	���߳�Ҫ���еĴ������ڸ�run�����С�

3��ͨ��Thread�ཨ���̶߳���
4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
	ΪʲôҪ��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯����
	��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
	����Ҫ���߳�ȥָ��ָ�������run�������ͱ�����ȷ��run������������


5������Thread���start���������̲߳�����Runnable�ӿ������run������



ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�

ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

���ַ�ʽ����
�̳�Thread:�̴߳�����Thread����run�����С�
ʵ��Runnable���̴߳�����ڽӿڵ������run������
*/

class Ticket extends Thread
{
	private int tick = 100 ;
	public void run()
	{
		while(true)
		{
			if(tick > 0)
			{
				System.out.println(currentThread().getName() + "sale : " + tick--) ;
			}
		}

	}
}
class TicketDemo
{
	public static void main(String[] args) 
	{
		Ticket t1 = new Ticket() ;
//		Ticket t2 = new Ticket() ;
//		Ticket t3 = new Ticket() ;
//		Ticket t4 = new Ticket() ;

		t1.start() ; //�߳��쳣
		t1.start() ;
		t1.start() ;
		t1.start() ;
	}
}
