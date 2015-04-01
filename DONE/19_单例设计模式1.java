/*
设计模式：解决某一类问题最行之有效的方法，java中有23中设计模式。
单例设计模式：解决一个类在内存中只存在一个对象

想要保证对象唯一：
1、为了避免其他程序过多建立该类对象，先禁止其他程序建立该类对象。
2、还为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象。
3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

这三步怎样用代码体现？
1、将构造函数私有化。
2、在类中创建一个本类对象
3、提供一个方法可以获取该对象。

用法：对于事物该怎样描述，还怎样描述，当需要保证该事物的对象在内存中唯一是，将以上的三步加上即可。

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

	private static Single s = new Single() ;  //由于这个属性s被静态函数getInstance()访问，所以也必须是static的

    /*可以让其他程序获取Single对象的方法*/
	public static Single getInstance()   //由于获取类的对象的方式只有两种：对象.Single()或者类名.Single(),
	{ 									 //此时其他程序还没有获得这个类的任何对象，所以只有通过 类名.Single()的方式
                                         //所以将该方法声明为static。
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