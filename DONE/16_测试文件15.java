/*
Ӧ��ArrayTool��
*/
class ArrayToolDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,3,87,32,8} ;
/*
		ArrayTool tool = new ArrayTool() ;

		int max = tool.getMax(arr) ;
		System.out.println(max);
		
		int min = tool.getMin(arr) ;
		System.out.println(min);
		
		tool.printArray(arr) ;
		tool.selectSort(arr) ;
		tool.printArray(arr) ;
*/
		int max = ArrayTool.getMax(arr) ; //ͨ������ֱ�ӵ���static������
		System.out.println(max);
	}
}
