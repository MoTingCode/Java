/*   ԭ�򣺶��嵥��ģʽ������ʹ�ö���ʽ
�������ģʽд��һ
������ȳ�ʼ�����󣬳�Ϊ������ʽ
Single��һ�����ڴ���Ѿ��������˶���

class Single
{
	private static Single s = new Single() ;

	private Single(){}

	public static Single getInstance()
	{
		return s ;
	}
}
*/

/*
�������ģʽд����
�������ڷ���������ʱ�ų�ʼ����Ҳ�����������ʱ���أ���Ϊ������ʽ��
Single����ڴ棬����û�д��ڣ�ֻ�е�����getInstance����ʱ���Ž�������
*/
class Single
{
	private static Single s = null ;

	private Single(){}

	public static Single getInstance()
	{
		if(s == null)
			s = new Single() ;
		return s ;
	}
}

class  SingleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
