class  selectSort
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

		/*�����ѡ��������*/
	public static void selectSort(int[] arr)
	{
		for(int x = 0; x<arr.length-1; x++)  //������ĵ�һ��Ԫ�ؿ�ʼ����˳��ȡÿһ��Ԫ�أ��������ڶ���Ԫ��Ϊֹ(arr.length-1)����Ϊֻʣ�����һ��Ԫ��ʱ�����Ѿ��ź����ˡ�
		{
			for(int y = x+1; y<arr.length; y++)  //��ȡ����Ԫ���������(y=x+1)��ÿһ��Ԫ�رȽ�(û��Ҫ���Լ��Ƚ�)��
			{
				if(arr[x]>arr[y])    //��������Ԫ�ر�ȡ����Ԫ��С���ͽ�������Ԫ�ء�
				{
					int temp = arr[x] ;  //tempΪ�м���������ڽ�������Ԫ�ء�
					arr[x] = arr[y] ;
					arr[y] = temp ;
				}
			}
		}
	}
}
