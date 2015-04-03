/*
如果将ArrayTool.class文件发送给其他人，其他人只要将该文件设置到classpath路径下，就可以使用该工具类。
但是要有该类的使用说明书才方便使用。

开始制作程序的说明书。java的说明书通过文档和注释来完成。

想要被软件识别为解释文档，要用的符号为:                               
*/
//                                      /**    注意要两个*
//                                      */
//                                      @author 作者名               表示作者，中间有空格
//                                      @version v111                表示版本
//                                      @param x 参数的解释          表示参数
//                                      @eturn 返回值的解释          表示返回值

/**
这是一个可以对数组进行操作的工具类，提供了获取最值，排序等功能。
@author Moting
@version v1.1
*/

public class ArrayTool   //如果要对一个类生成帮助文档，这个类必须是public
{
	/**
	空参数构造函数。
	*/
	private ArrayTool() {}  //构造函数私有化
                             //一个类中默认会有一个空参数的构造函数，这个默认的构造函数的权限和所属类一致
							 //如果类被public修饰，那么默认的构造函数也带public修饰符
							 //如果类没有被public修饰，那么默认的构造函数也没有public
							 //默认的构造函数的权限是随着类的变化而变化的。

	/**
	获取一个整形数组的最大值
	@param arr 接受一个int类型的数组
	@return 会返回一个该数组中最大值
	*/
	public static int getMax(int[] arr)  
	{
		int max = 0 ;
		for(int x = 1; x<arr.length; x++)
			if(arr[x]>arr[max])
				max = x ;
		return arr[max] ;
	}

	/**
	获取一个整形数组的最小值
	@param arr 接受一个int类型的数组
	@return 会返回一个该数组中最小值
	*/
	public static int getMin(int[] arr)
	{
		int min = 0 ;
		for(int x = 1; x<arr.length; x++)
			if(arr[x]<arr[min])
				min = x ;
		return arr[min] ;

	}
	
	/**
	对int数组进行选择排序
	@param arr 接受一个int类型的数组
	*/
	public static void selectSort(int[] arr)
	{
		for(int x = 0; x<arr.length-1; x++)
		{
			for(int y = x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y) ;
				}
			}
		}
	}

	/**
	对int数组进行冒泡排序
	获取一个整形数组的最大值
	@param arr 接受一个int类型的数组
	*/
	public static void bubbleSort(int[] arr)
	{
		for(int x = 0; x < arr.length-1; x++)
		{
			for(int y = 0; y < arr.length-1-x; y++)
				if(arr[y]>arr[y+1])
					swap(arr, y, y+1) ;
		}
	}
	
	/**
	将数组的两个元素交换位置
	@param arr 接受一个int类型的数组
	@param a 要交换的位置
	@param b 要交换的位置
	*/
	private static void swap(int[] arr, int a, int b) //能隐藏的都隐藏，swap函数只提供给本类函数使用，所以声明为private。
	{
		int temp = arr[a] ;
		arr[a] = arr[b] ;
		arr[b] = temp ;
	}
	/**
	打印数组中的元素，打印形式是：[element1,elemet2,...]
	@param arr 要交换的位置
	*/
	public static void printArray(int[] arr)
	{
		System.out.print("[") ;
		for(int x = 0; x < arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",") ;
			else
				System.out.println(arr[x]+"]") ;
		}
	}
}
