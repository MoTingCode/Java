/*
��̬���������Ϊ������ڵĶ���������̬��

1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������

2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ��:���ڸ��ǡ�

3����̬�ĺô�
	��̬�ĳ��ִ�������˳������չ�ԡ�

4����̬�׶�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ���ĳ�Ա��

5����̬��Ӧ��
	
6����̬�ĳ��ִ����е��ص�
	
*/

abstract class Animal
{
	abstract void eat() ;
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����") ;
	}
	public void catchMouse()
	{
		System.out.println("ץ����") ;
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ") ;
	}

	public void kanJia()
	{
		System.out.println("wangwang") ;
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����") ;
	}
	public void gongDi()
	{
		System.out.println("����") ;
	}
}

class  test
{
	public static void main(String[] args) 
	{
	/*  Cat c = new Cat() ;
		c.eat() ;
		Dog d = new Dog() ;
		d.eat() ;
	*/


/*	    Animal a = new Cat() ; //���������ָ�����Լ����������
		                         //��������������ת��Cat->Animal
		a.eat() ;

	//�����Ҫ����è�����з���ʱ����β�����
	//ǿ�ƽ���������ã�ת�������������
		Cat c = (Cat)a ;    //����ת��
		c.catchMouse() ;
        
	//	Animal d  = new Animal() ;   
	//	Cat e = (Cat)d ;  //ǧ��Ҫ���������Ĳ��������ǽ�����Ķ���ת�����������͡�
	                      //������ת�����Ǹ�������ָ�����Լ����������ʱ�������ÿ��Ա�����Ҳ���Ա�ǿ��ת����
                          //��̬��ʼ���ն���������������仯��
*/


		function(new Cat()) ; //Animal a = new Cat() ;
		function(new Dog()) ;

	}

	public static void function(Animal a)
	{
		a.eat() ;
		
		if(a instanceof Cat)  //�ж���������
		{
			Cat c = (Cat)a ;
			c.catchMouse() ;
		}
		else if(a instanceof Dog)
		{
			Dog c = (Dog)a ;
			c.kanJia() ;
		}
	}

}
