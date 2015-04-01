/*
数组的查找操作和插入操作
*/
class getIndex 
{
	//获取key第一次出现的位置，如果返回-1，表示key在数组中不存在
	public static int getIndex(int[]arr, int key)
	{
		for(int x = 0; x < arr.length; x++)
		{
			if(arr[x]==key)
				return x ;
		}
		return -1 ;
	}

	/*
	数组的折半查找，提高效率，但是必须保证数组是有序的
	*/
	public static int halfSearch(int[] arr, int key)
	{
		int min, max, mid ;
		min = 0 ;
		max = arr.length-1 ;
		mid = (max+min)/2 ;


		while(arr[mid] != key)
		{
			if(key>arr[mid])
				min = mid + 1 ;
			else if(key<arr[mid])
				max = mid - 1 ;
			
			if(min>max) //检查是否已经查找完数组中所有的元素
				return -1 ;

			mid = (max+min)/2 ;
		}
		return mid ;
	}

	/*
	折半查找的第二种方法
	*/
	public static int halfSearch_2(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid ;

		while(min <= max)
		{
			mid = (min + max)>>1 ; //右移，相当于除以2。

			if(key>arr[mid])
				min = mid + 1 ;
			else if(key<arr[mid])
				max = mid - 1 ;
			else
				return mid ;
		}
		return -1 ;
	}

	/*
	在有序数组中寻找要插入的给定元素的位置，其实就是将上面的
	halfSearch_2的最后return -1改为return min。每次查找结束后
	1、如果找到要插入的元素，那么说明数组中有这个元素，在mid即
	数组中那个同样的元素处插入就可以。
	2、如果没有在数组中找到要插入的元素，返回min，此时min就是
	该元素插入后的位置
	（因为：如果没找到，倒数第二次总是min和max
	重合，如果此时
		1、key<arr[mid]，那么max=mid-1；此时arr[min]>key并且arr[max]<key，那么min处是要插入的位置。
		2、key>arr[mid], 那么min=mid+1；此时arr[min]>key丙炔arr[max]<key，那么min处是要插入的位置）
	*/
	public static int arrayInsert(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid ;

		while(min <= max)
		{
			mid = (min + max)>>1 ; //右移，相当于除以2。

			if(key>arr[mid])
				min = mid + 1 ;
			else if(key<arr[mid])
				max = mid - 1 ;
			else
				return mid ;
		}
		return min ;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,6,7,12,21,30} ;
		System.out.println(getIndex(arr, 2));
		System.out.println(halfSearch(arr, 2));
		System.out.println(halfSearch_2(arr, 333));
		System.out.println(arrayInsert(arr, 333));
	}
}
