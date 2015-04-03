/*
此程序用于打印杨辉三角
————*
———* *
——* * *
—* * * *
* * * * *   

*/
class test 
{
	public static void main(String[] args) 
	{
        for(int x = 0; x < 5; x++)  //外层循环控制行数，x从第一行开始到第5行。
		{
			for(int y = x; y < 4; y++) //内层循环，对每一行先打印前面的下划线——，相当于打印下三角。
				System.out.print("——") ;//打印完不换行。
			for(int z = 0; z <= x; z++) //内层循环，对每一行在——之后打印“*+空格”，相当于打印上三角。
				System.out.print("* ") ;
			
			System.out.println() ; //在每一行结束后换行。
		}
		
	}
}
