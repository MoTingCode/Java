class  printArray
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
		/*����Ĵ�ӡ�������*/
	public static void printArray(int[] arr)
	{
		System.out.print("[") ;
		for(int x = 0; x < arr.length; x++)  //������ĵ�һ��Ԫ�ؿ�ʼ�����һ����
		{
			if(x != arr.length-1)       //�жϵ�ǰԪ���Ƿ������һ��Ԫ��
				System.out.print(arr[x]+", ") ;  //���������һ��Ԫ����� ����Ԫ��+��+�ո�
			else
				System.out.println(arr[x]+"]") ; //�������һ��Ԫ����� ����Ԫ��+]��
		}
	}
}
