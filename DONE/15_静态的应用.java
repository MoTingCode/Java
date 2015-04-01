/*
��̬��Ӧ�ã�
ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ����Խ���Щ���ܽ��г�ȡ��������װ�����и��á�

��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ���߷�������������в��������Ƿ��������⣺
1�����������ڷ�װ���ݵģ�����ArrayTool����δ��װ��������
2��������������з�����û���õ�ArrayTool�����е���������
���Ǿ�Ҫ���ǣ��ó�����Ͻ����ǲ���Ҫ����ģ��Ϳ��Խ�ArrayTool�еķ����������static�ģ�ֱ��ͨ���������ü��ɡ�

����������̬�󣬿��Է���ʹ�ã����Ǹ��໹�ǿ��Ա���������������ġ�
Ϊ�˸�Ϊ�Ͻ���ǿ���ø��಻�ܽ������󣬿���ͨ�������캯��˽�л���ɡ�


�����ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�classpath·���£��Ϳ���ʹ�øù����ࡣ
����Ҫ�и����ʹ��˵����ŷ���ʹ�á�

��ʼ���������˵���顣java��˵����ͨ���ĵ���ע������ɡ�
*/

/*
����һ�����Զ�������в����Ĺ����࣬�ṩ�˻�ȡ��ֵ������ȹ��ܡ�
@author Moting
@version v1.1
*/

public class ArrayTool   //���Ҫ��һ�������ɰ����ĵ�������������public
{
	/*
	�ղ������캯����
	*/
	private ArrayTool() {}  //���캯��˽�л�

	/*
	��ȡһ��������������ֵ
	@param arr ����һ��int���͵�����
	@return �᷵��һ�������������ֵ
	*/
	public static int getMax(int[] arr)  
	{
		int max = 0 ;
		for(int x = 1; x<arr.length; x++)
			if(arr[x]>arr[max])
				max = x ;
		return arr[max] ;
	}

		/*
	��ȡһ�������������Сֵ
	@param arr ����һ��int���͵�����
	@return �᷵��һ������������Сֵ
	*/
	public static int getMin(int[] arr)
	{
		int min = 0 ;
		for(int x = 1; x<arr.length; x++)
			if(arr[x]<arr[min])
				min = x ;
		return arr[min] ;

	}
	
	/*
	��int�������ѡ������
	@param arr ����һ��int���͵�����
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

	/*
	��int�������ð������
	��ȡһ��������������ֵ
	@param arr ����һ��int���͵�����
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
	
	/*
	�����������Ԫ�ؽ���λ��
	@param arr ����һ��int���͵�����
	@param a Ҫ������λ��
	@param b Ҫ������λ��
	*/
	private static void swap(int[] arr, int a, int b) //�����صĶ����أ�swap����ֻ�ṩ�����ຯ��ʹ�ã���������Ϊprivate��
	{
		int temp = arr[a] ;
		arr[a] = arr[b] ;
		arr[b] = temp ;
	}
	/*
	��ӡ�����е�Ԫ�أ���ӡ��ʽ�ǣ�[element1,elemet2,...]
	@param a Ҫ������λ��
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
