/*
5、多态的应用
*/
/*
基础班学生：学习，睡觉
高级版学生：学习，睡觉
可以将这两类进行抽取
*/
abstract class Student  //将两个类抽取为学生类
{
	public abstract void study() ;  //抽象方法，不同的学生有不同的学习，这个方法由不同的学生重写
	public void sleep()
	{
		System.out.println("躺着睡") ;
	}
}

class BaseStudent extends Student  //BaseStudent类继承Student类
{
	public void study()    //子类重写函数
	{
		System.out.println("base study") ;  
	}
	public void sleep()    //子类重写函数
	{
		System.out.println("坐着睡") ;
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study") ;
	}
}

class DoStudent   //将study和sleep单独拿出来构成一个类。
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
