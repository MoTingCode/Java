/*
���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ����ȡ����ʼ�ͽ�����ʱ�䲢�����

��ȡʱ�䣺System.currentTimeMillis() ;

���ַ�ʽ������ģ�巽�����ģʽ��
���ͣ������ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ�����ǲ�ȷ���ģ���ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣�
��ô��ʱ�ͽ���ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ��ɡ�
*/
abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis() ;
		
		runcode() ;
		long end = System.currentTimeMillis() ;
		System.out.println(start) ;
		System.out.println(end) ;
		System.out.println("���룺"+(end-start)) ;
	}
	public abstract void runcode() ;     //���಻֪������Ҫ����ʲô���������ʱ�䣬���Խ��˷�������Ϊ���󷽷��������ิд��
}


class SubTime extends GetTime
{
	public void runcode()     //���ิд�������������Ҫ���ԵĴ��롣
	{
		for(int x = 0; x < 1000; x++)
			System.out.println(x) ;
	}
}
class  TemplateDemo
{
	public static void main(String[] args) 
	{
		SubTime gt = new SubTime() ;
		gt.getTime() ;
	}
}
