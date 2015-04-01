/*
���ģʽ�����ĳһ����������֮��Ч�ķ�����java����23�����ģʽ��
�������ģʽ�����һ�������ڴ���ֻ����һ������

��Ҫ��֤����Ψһ��
1��Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������������
2����Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ���һ������
3��Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

�����������ô������֣�
1�������캯��˽�л���
2�������д���һ���������
3���ṩһ���������Ի�ȡ�ö���

�÷��������������������������������������Ҫ��֤������Ķ������ڴ���Ψһ�ǣ������ϵ��������ϼ��ɡ�

*/
class Single
{
	private int num ;
	public void setNum(int num)
	{
		this.num = num ;
	}
	public int getNum()
	{
		return num ;
	}

	private Single(){}

	private static Single s = new Single() ;  //�����������s����̬����getInstance()���ʣ�����Ҳ������static��

    /*���������������ȡSingle����ķ���*/
	public static Single getInstance()   //���ڻ�ȡ��Ķ���ķ�ʽֻ�����֣�����.Single()��������.Single(),
	{ 									 //��ʱ��������û�л���������κζ�������ֻ��ͨ�� ����.Single()�ķ�ʽ
                                         //���Խ��÷�������Ϊstatic��
		return s ;
	}

}


class  SingleDemo
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setNum(30) ;
		System.out.println(s2.getNum()) ;
	}
}