/*
��̬�����
��ʽ��      static
			{
				��̬������е�ִ����䡣
			}
�ص㣺������ļ��ض�ִ�У�ִֻ��һ��,��������main����
���ڸ�����г�ʼ����
��ļ��ذ�����
           new StaticCode() ;
		   StaticCode.show() ;
        �� StaticCode s = null ;��������ļ��أ�ֻ�е� StaticCode s = new StaticCode();ʱ����Ż���ء�
*/
class  StaticCode
{
	int num = 9 ;
	StaticCode()
	{
		System.out.println("b")
	}
	/*���캯����ָ�������ʼ��*/
	StaticCode(int a)
	{
		num = a ;
	}
	/*��̬�����,�����ʼ��*/
	static	
	{
		System.out.print("a") ;
	}
	
	/*�������飬�������ʼ��*/
	{
		System.out.println("c") ;
	}
	
	public static void show()
	{
		System.out.println("fuck") ;
	}
}
class StaticDemo
{
	static
	{
		System.out.print("d") ;
	}
	
	public static void main(String[] args) 
	{
		//new StaticCode()
		System.out.print("over");
	}
	
	static
	{
		System.out.print("c") ;
	}
}
//����Ľ��Ϊ b c a over
