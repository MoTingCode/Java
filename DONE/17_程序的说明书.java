/*
�����ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�classpath·���£��Ϳ���ʹ�øù����ࡣ
����Ҫ�и����ʹ��˵����ŷ���ʹ�á�

��ʼ���������˵���顣java��˵����ͨ���ĵ���ע������ɡ�

��Ҫ�����ʶ��Ϊ�����ĵ���Ҫ�õķ���Ϊ:                               
*/
//                                      /**    ע��Ҫ����*
//                                      */
//                                      @author ������               ��ʾ���ߣ��м��пո�
//                                      @version v111                ��ʾ�汾
//                                      @param x �����Ľ���          ��ʾ����
//                                      @eturn ����ֵ�Ľ���          ��ʾ����ֵ

/**
����һ�����Զ�������в����Ĺ����࣬�ṩ�˻�ȡ��ֵ������ȹ��ܡ�
@author Moting
@version v1.1
*/

public class ArrayTool   //���Ҫ��һ�������ɰ����ĵ�������������public
{
	/**
	�ղ������캯����
	*/
	private ArrayTool() {}  //���캯��˽�л�
                             //һ������Ĭ�ϻ���һ���ղ����Ĺ��캯�������Ĭ�ϵĹ��캯����Ȩ�޺�������һ��
							 //����౻public���Σ���ôĬ�ϵĹ��캯��Ҳ��public���η�
							 //�����û�б�public���Σ���ôĬ�ϵĹ��캯��Ҳû��public
							 //Ĭ�ϵĹ��캯����Ȩ����������ı仯���仯�ġ�

	/**
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

	/**
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
	
	/**
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

	/**
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
	
	/**
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
	/**
	��ӡ�����е�Ԫ�أ���ӡ��ʽ�ǣ�[element1,elemet2,...]
	@param arr Ҫ������λ��
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
