/*
public static void main(String[] args) 
主函数：是一个特殊的函数，作为程序的入口，可以被JVM调用。
主函数的定义：
public：代表该函数的访问权限是最大的
static：代表主函数随着类的加载就已经存在了
void：主函数没有具体的返回值。
main：不是关键字，但是是一个特殊的单词，可以被JVM识别。
(String[] arr)：主函数的参数，参数类型是一个数组，该数组中的元素是字符串。即字符串类型的数组。
主函数是固定格式的：JVM识别。主函数中唯一可以改动的是args（arguments参数），是可以改的。

JVM在调用主函数时，传入的是new String[0]
可以手动给主函数传入参数，方法是在java命令时在类名后面加入参数，各个参数用空格间隔开
javac 13_main.java
java MainDemo haha hehe heihei hiahia xixi

这样，JVM就会建立一个长度为5的字符串数组args，
并且令args[0]="haha",args[1]="hehe",args[2]="heihei",args[3]="hiahia",args[4]="xixi"
*/
class  MainDemo
{
	public static void main(String[] args) //传入的参数args只有两种可能：new String[]或者null。
	{
		System.out.println(args); //证明是new String[]
		System.out.println(args.length) ;//证明是new String[0]
		for(int x = 0; x < args.length; x++)
			System.out.println(args[x]) ;
	}
}