/*
final:���գ���Ϊһ�����η�
1�����������࣬������������
2����final���ε��಻���Ա��̳С�Ϊ�˱��ⱻ�̳С������ิд���ܡ�
3����final���εķ��������Ա���д��
4����final���εı�����һ��������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա�������ֿ������ξֲ�������
   ������������ʱ��һЩ���ݵ�ֵ�ǹ̶��ģ�Ϊ����ǿ�Ķ��ԣ�������Щֵ�����֣��������Ķ���
   �����ֵ����Ҫ�ı䣬���Լ���final���Ρ�	
   ��Ϊ��������д�淶�����е���ĸ����д������ɶ��������ɣ�����֮��ͨ��_���ӡ�
5���ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������
*/
 class Fu
{
	final int x = 3 ;
	final void show1()
	{
		final int y = 4 ;
	}
	void show2()
	{}
}

class Zi extends Fu
{
	void show1()
	{}
}
class  test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}