/*
�˳����������ð������
*/
class  bubble
{
	/*���������ð������*/
	public static void bubbleSort(int[] arr)
	{
		for(int x = 0; x < arr.length-1; x++) //����arr.length��Ԫ�أ���Ҫ(arr.length-1)�˱Ƚϲ����ź���-1����ֻʣ���һ��Ԫ���ǣ�ʵ�����Ѿ��ź����ˡ�
		{
			for(int y = 0; y < arr.length-x-1; y++) //ÿһ��x++��ʾ��һ��ֵ���ź���������ѭ������Ƚϵ�Ԫ�����𼶼������ԣ�y<arr.length-x��
			{                                       //��Ϊ����arr[y]��arr[y+1]�Ƚϣ����Ե�ÿһ��yȡ�������ڶ���Ԫ��ʱ��y+1�����һ��Ԫ�أ�����yû��Ҫȡ���һ��Ԫ�أ���yȡ���һ��Ԫ�أ�y+1�ͻᷢ��Խ�磬���ԣ�y<arr.length-x-1��
				if(arr[y]>arr[y+1])  //ÿ�αȽ���������Ԫ�ء�
				{
					int temp = arr[y] ;
					arr[y] = arr[y+1] ;
					arr[y+1] = temp ;
				}

			}
         
		}
	}
	/*��ӡ������*/
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
	public static void main(String[] args) 
	{
		int[] arr = {9,5,7,8,6,11,2,10} ;
		
		bubbleSort(arr) ;
		printArray(arr) ;
	}
}
