/*
	��ά����
	�������ȷ���巽ʽ��
	һά�� int[] x ;
	       int x[] ;
    ��ά�� int[][] y ;
	       int y[][] ;
		   int[] y[] ;
*/
class  Array2
{
	public static void main(String[] args) 
	{
	/*
	int[][] arr = new int[3][4] ;//����������Ϊarr�Ķ�λ���飬��λ��������3��һά����ÿһ��һλ��������4��Ԫ��
    int[][] arr = new int[3][] ; //��λ����ĳ���Ϊ3����ά������һά����ĳ��Ȳ�ȷ��
	                               //System.out.println(arr[1])�Ľ��Ϊnull����Ϊ��ά�����е�3��һά���飨arr[0]��arr[1]��arr[2]��û�г�ʼ���������Ǳ�Ĭ�ϳ�ʼ��
								   //����Ϊ�����������������ͣ�����Ĭ�ϳ�ʼ����ֵΪnull
	arr[0] = new int[3] ;    
	arr[1] = new int[1] ;
	arr[2] = new int[2] ;   //�Զ�ά�����е�ÿһ��С��������ֶ���ʼ����

	System.out.println(arr.length) ; //��ӡ��ά����ĳ��ȣ����Ϊ3
	System.out.println(arr[0].length) ;  //��ӡ��ά�����е�һ��һά���鳤��
*/
	int[][] arr = {{1,2,4},{2},{5,3}} ;
	
	int sum = 0 ; //�ͱ���
	for(int x = 0; x<arr.length; x++)
	{
		for(int y = 0; y<arr[x].length; y++)
			sum += arr[x][y] ;
	}


		System.out.println(sum);
	}
}
