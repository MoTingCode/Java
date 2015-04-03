/*
	二维数组
	数组的正确定义方式：
	一维： int[] x ;
	       int x[] ;
    二维： int[][] y ;
	       int y[][] ;
		   int[] y[] ;
*/
class  Array2
{
	public static void main(String[] args) 
	{
	/*
	int[][] arr = new int[3][4] ;//定义了名称为arr的二位数组，二位数组中有3个一维数组每一个一位数组中有4个元素
    int[][] arr = new int[3][] ; //二位数组的长度为3，二维数组中一维数组的长度不确定
	                               //System.out.println(arr[1])的结果为null，因为二维数组中的3个一维数组（arr[0]、arr[1]、arr[2]）没有初始化，所以是被默认初始化
								   //又因为数组是引用数据类型，所以默认初始化的值为null
	arr[0] = new int[3] ;    
	arr[1] = new int[1] ;
	arr[2] = new int[2] ;   //对二维数组中的每一个小数组进行手动初始化。

	System.out.println(arr.length) ; //打印二维数组的长度，结果为3
	System.out.println(arr[0].length) ;  //打印二维数组中第一个一维数组长度
*/
	int[][] arr = {{1,2,4},{2},{5,3}} ;
	
	int sum = 0 ; //和变量
	for(int x = 0; x<arr.length; x++)
	{
		for(int y = 0; y<arr[x].length; y++)
			sum += arr[x][y] ;
	}


		System.out.println(sum);
	}
}
