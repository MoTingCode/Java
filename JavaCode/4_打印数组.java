class  printArray
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
		/*数组的打印输出函数*/
	public static void printArray(int[] arr)
	{
		System.out.print("[") ;
		for(int x = 0; x < arr.length; x++)  //从数组的第一个元素开始到最后一个。
		{
			if(x != arr.length-1)       //判断当前元素是否是最后一个元素
				System.out.print(arr[x]+", ") ;  //若不是最后一个元素输出 “该元素+，+空格”
			else
				System.out.println(arr[x]+"]") ; //若是最后一个元素输出 “该元素+]”
		}
	}
}
