
/*
�������ģʽ��


*/
//����ʽ��
/*
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/


//����ʽ
/*
����ʽ�ص�����ʵ�����ӳټ���
�����ڶ��̷߳���ʱ����ְ�ȫ����
���Լ�ͬ�����������ͬ��������ͬ���������У�������΢��Щ��Ч��
��˫���жϵ���ʽ�ܽ���ж����⣬
��ͬ��ʱ��ʹ�õ����Ǹ����������ֽ����ļ�����
*/
class Single
{
	private static Single s = null;
	private Single(){}


	public static  Single getInstance()
	{
		if(s == null)  
		{
			synchronized(Single.class)
			{
				if(s==null)
					s = new Single() ;
				return s;
			}
		}
	/*   
			synchronized(Single.class)  //�����������ȥ����if(s == null)���������Ч���⣬
			{                           //��Ϊÿ�����߳̽��붼��������Ȼ���ж�s==null��
				if(s==null)
					s = new Single() ;
				return s;
			}

	*/
	}
}

class SingleDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
