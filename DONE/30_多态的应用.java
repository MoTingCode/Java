/*
5����̬��Ӧ��
*/
/*
������ѧ����ѧϰ��˯��
�߼���ѧ����ѧϰ��˯��
���Խ���������г�ȡ
*/
abstract class Student  //���������ȡΪѧ����
{
	public abstract void study() ;  //���󷽷�����ͬ��ѧ���в�ͬ��ѧϰ����������ɲ�ͬ��ѧ����д
	public void sleep()
	{
		System.out.println("����˯") ;
	}
}

class BaseStudent extends Student  //BaseStudent��̳�Student��
{
	public void study()    //������д����
	{
		System.out.println("base study") ;  
	}
	public void sleep()    //������д����
	{
		System.out.println("����˯") ;
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study") ;
	}
}

class DoStudent   //��study��sleep�����ó�������һ���ࡣ
{
	public void doSome(Student stu)
	{
		stu.study() ;
		stu.sleep() ;
	}

}


class  test
{
	public static void main(String[] args) 
	{
	/*	BaseStudent bs = new BaseStudent() ;
		bs.study() ;
		bs.sleep() ;
	*/

		DoStudent ds = new DoStudent() ;
		ds.doSome(new BaseStudent()) ;
		ds.doSome(new AdvStudent()) ;
	}


}
