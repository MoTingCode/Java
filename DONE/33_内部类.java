/*
�ڲ�����ʹ���
1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա��
   ����Ϊ�ڲ����г�����һ���ⲿ���Ӧ�ã���ʽ���ⲿ����.this
2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������

���ʸ�ʽ��
 1�����ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�С����ⲿ�����ࣨclass test�ࣩ�У�����ֱ�ӽ����ڲ������
��ʽ��  �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������ ;
        Outer.Inner in = new Outer().new Inner() ; 
 2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
    ���磬private�����ڲ������ⲿ���н��з�װ��
	      static���ڲ���;߱��˾�̬�����ԡ����ڲ��౻static���κ�ֻ�ܷ���ֱ�ӷ����ⲿ���е�static��Ա�������˷��ʾ��ޡ�

	���ⲿ�����ࣨclass test�ࣩ�У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա�أ�
	new Outer.Inner().function() ;
	���ⲿ�������У����ֱ�ӷ���static�ڲ���ľ�̬��Ա�أ�
	Outer.Inner.function() ;
ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static�ġ�
      ���ⲿ���еľ�̬�Ű������ڲ���ʱ���ڲ���Ҳ�����Ǿ�̬�ġ�

�ڲ����÷���
	����������ʱ��������ڲ�����ʵ����������ڲ����������������ڲ�������ʹ���ⲿ��������ݡ�

 
*/
class Outer
{
	int x = 1 ;
	static int y = 2 ;
	class Inner  //�ڲ���
	{
		int x = 2 ;
		void function()
		{
			int x = 3 ;
			System.out.println("Inner:"+x) ;  //x=3  ���û�ж���int x = 2,int x = 3��ô��һ��Ҳ���Է����ⲿ���е�x=1����Ϊʡ����Outer.this.
			System.out.println("Inner:"+this.x) ;  //x=2
			System.out.println("Inner:"+Outer.this.x) ;//x=1 ���ڷ����ⲿ���x.

		}
	}

	static class Inner2
	{	
		void function()
		{
	//		System.out.println("Inner:"+x) ;  //static�ڲ��ֻ࣬�ܷ����ⲿ���static��Ա,x�Ƿ�static�ģ�������һ�����
			System.out.println("Inner:"+y) ;  //y��static�Ŀ��Է���
		}
	}

	void method()
	{
		Inner in = new Inner() ;
		in.function() ;
	}
}


class test
{
	public static void main(String[] args) 
	{
	/*	Outer out = new Outer() ;
		out.method() ;
	*/
/*
	Outer.Inner in = new Outer().new Inner() ;  //�ڲ����ֱ�ӷ��ʷ�ʽ
	in.function() ;
*/
	
/*	Outer.Inner2 in = new Outer().new Inner2() ;  //static�ڲ��ֻ࣬�ܷ����ⲿ���static��Ա
	in.function() ;
*/
/*	new Outer.Inner2().function() ; //Inner2��static�ģ����ⲿ��Outerһ���أ��ڲ���ʹ����ˣ���������Outer����ֱ�ӵ���Inner������function�Ƿ�static�ģ�����ͨ��һ�����������ã�������Ҫnewһ������������function��
	Outer.Inner2().function() ; //����functionҲ����Ϊstatic�ģ���ô�������ʡ�
*/
	
	}

}
