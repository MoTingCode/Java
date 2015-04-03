/*
����Ĳ��Ҳ����Ͳ������
*/
class getIndex 
{
	//��ȡkey��һ�γ��ֵ�λ�ã��������-1����ʾkey�������в�����
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
	������۰���ң����Ч�ʣ����Ǳ��뱣֤�����������
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
			
			if(min>max) //����Ƿ��Ѿ����������������е�Ԫ��
				return -1 ;

			mid = (max+min)/2 ;
		}
		return mid ;
	}

	/*
	�۰���ҵĵڶ��ַ���
	*/
	public static int halfSearch_2(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid ;

		while(min <= max)
		{
			mid = (min + max)>>1 ; //���ƣ��൱�ڳ���2��

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
	������������Ѱ��Ҫ����ĸ���Ԫ�ص�λ�ã���ʵ���ǽ������
	halfSearch_2�����return -1��Ϊreturn min��ÿ�β��ҽ�����
	1������ҵ�Ҫ�����Ԫ�أ���ô˵�������������Ԫ�أ���mid��
	�������Ǹ�ͬ����Ԫ�ش�����Ϳ��ԡ�
	2�����û�����������ҵ�Ҫ�����Ԫ�أ�����min����ʱmin����
	��Ԫ�ز�����λ��
	����Ϊ�����û�ҵ��������ڶ�������min��max
	�غϣ������ʱ
		1��key<arr[mid]����ômax=mid-1����ʱarr[min]>key����arr[max]<key����ômin����Ҫ�����λ�á�
		2��key>arr[mid], ��ômin=mid+1����ʱarr[min]>key��Ȳarr[max]<key����ômin����Ҫ�����λ�ã�
	*/
	public static int arrayInsert(int[] arr, int key)
	{
		int min = 0, max = arr.length-1, mid ;

		while(min <= max)
		{
			mid = (min + max)>>1 ; //���ƣ��൱�ڳ���2��

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
