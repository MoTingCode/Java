/*
6����̬�ĳ��ִ����е��ص�
	1���ڶ�̬�г�Ա��������static�����ص㣨������ָ���������ʱ����
		                                            �ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�У�����ʧ�ܡ�
													������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
    ���ܽ᣺��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�

	����static��Ա�������������۱�������У����ο���ߡ�

    2���ڶ�̬�г�Ա�������ص㣺
	���۱�������У����ο���ߣ������ͱ����������ࣩ��
*/

class Fu
{
	void method1()
	{
		System.out.println("fu method1") ;	
	}
	void method2()
	{
		System.out.println("fu method2") ;	
	}
	static void method4()
	{
		System.out.println("fu method4") ;	
	}
}

class Zi extends Fu
{
	void method1()
	{
		System.out.println("zi method1") ;
	}
	void method3()
	{
		System.out.println("zi method3") ;	
	}
	static void method4()
	{
		System.out.println("zi method4") ;	
	}

}
class  test
{
	public static void main(String[] args) 
	{
	/*	Zi z = new Zi() ;
		z.method1() ;  //��Fu��1������
		z.method2() ;  //����̳���
		z.method3() ;  //��������
	*/
	/*	Fu f = new Zi() ;
		
		f.method1() ;  //���Ϊzi method1,��Ϊ�������ڴ���ִ�е��Ƕ������е���Zi������е�method2������
		f.method2() ;
		//f.method3() ; //��һ���Ǳ���ʧ�ܵģ���Ϊ���ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�У�����ʧ�ܡ�
      */                  //f��Fu���͵ģ�Fu������û��method3������
		Fu f1 = new Zi() ;
		f1.method4() ;   //���Ϊfu method4 static��Ա�������������۱�������У����ο���ߡ���Ϊstatic���빲�����ľ�̬���У����ڶ�����ڡ�
	}
}
