class  selectSort
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

		/*数组的选择排序函数*/
	public static void selectSort(int[] arr)
	{
		for(int x = 0; x<arr.length-1; x++)  //从数组的第一个元素开始，按顺序取每一个元素，到倒数第二个元素为止(arr.length-1)。因为只剩下最后一个元素时，就已经排好序了。
		{
			for(int y = x+1; y<arr.length; y++)  //将取出的元素与其后面(y=x+1)的每一个元素比较(没必要跟自己比较)。
			{
				if(arr[x]>arr[y])    //如果后面的元素比取出的元素小，就交换两个元素。
				{
					int temp = arr[x] ;  //temp为中间变量，用于交换两个元素。
					arr[x] = arr[y] ;
					arr[y] = temp ;
				}
			}
		}
	}
}
