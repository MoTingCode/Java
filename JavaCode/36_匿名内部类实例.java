interface Inter
{
	void method() ;
}

class Test
{
/*
	static class Inner implements inter   //�ڲ���
	{
		public void method()
		{
			System.out.println("method run") ;
		}
	}
*/
	static Inter function()
	{
		return new Inter()   //�����ڲ���
		{
			public void method()
			{
				System.out.println("haha") ;
			}
		} ;
	}

}

class InnerClassTest  
{
	public static void main(String[] args) 
	{
		//Test.function()   Test������һ����̬�ķ���function��
		//.method()         function������������Ľ����һ�����󡣶�����һ��Inter���͵Ķ���
		//��Ϊֻ����Inter���͵Ķ��󣬲ſ��Ե���method������
		Test.function().method() ;
		                           //Inter in = Test.function();
		                           //in.method();

		show(new Inter()            //��ʱ���������show����
		{
			public void method()
			{
				System.out.println("method show run");
			}
		});
		
	}
	public static void show(Inter in)  //show����
	{
		in.method();
	}
}
