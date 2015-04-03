/*
此程序是数组的冒泡排序
*/
class  bubble
{
	/*对数组进行冒泡排序*/
	public static void bubbleSort(int[] arr)
	{
		for(int x = 0; x < arr.length-1; x++) //共有arr.length个元素，共要(arr.length-1)此比较才能排好序，-1：当只剩最后一个元素是，实际上已经排好序了。
		{
			for(int y = 0; y < arr.length-x-1; y++) //每一次x++表示有一个值被排好序，所以内循环参与比较的元素在逐级减少所以：y<arr.length-x。
			{                                       //因为是用arr[y]与arr[y+1]比较，所以当每一趟y取到倒数第二个元素时，y+1是最后一个元素，所以y没必要取最后一个元素，若y取最后一个元素，y+1就会发生越界，所以：y<arr.length-x-1。
				if(arr[y]>arr[y+1])  //每次比较两个相邻元素。
				{
					int temp = arr[y] ;
					arr[y] = arr[y+1] ;
					arr[y+1] = temp ;
				}

			}
         
		}
	}
	/*打印出数组*/
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
	public static void main(String[] args) 
	{
		int[] arr = {9,5,7,8,6,11,2,10} ;
		
		bubbleSort(arr) ;
		printArray(arr) ;
	}
}
