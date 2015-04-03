/*
打印输出图形
*****
****
***
**
*
*****
****
***
**
*
*
**
***
****
*****
*/

class test 
{
	public static void main(String[] args) 
	{
		for(int i = 5; i > 0; i--)  //此for循环控制行数，从第一行开始到第5行。令i=5，没操作一行令i--，这是为了使  打印的图形为：*****
		{                           //内层for循环变量j可以从0开始。                                                             ****
			for(int j = 0; j < i; j++) //对每一行，打印相应个数的*，第一行打印5个，i正好是要打印的*的个数。                     ***
				System.out.print("*"); //System.out.print()只打印不换行                                                         **
			                                                                                                        //          *
			System.out.println() ; //每一行的最后换行一次，System.out.println打印并且换行。
		}

		for(int i = 0; i < 5; i++) //此for循环控制行数，从第一行开始到第5行。令i从0开始，共5行。此程序打印的图形同上
		{
			for( int j = i; j < 5; j++)//内层for循环对每一行操作，第一行打印5个*，由于开始i=0，所以令j=i，j<5。
				System.out.print("*") ;
			System.out.println() ;   //每一行的最后换行一次。
		}

		for(int i = 0; i < 5; i++)//此for循环控制行数，从第一行开始到第5行。令i从0开始，共5行。此程序打印的结果为：  *              
		{                                                                                                       //   **           
			for(int j = 0; j <= i; j++) //内层for循环对每一行操作，第一行打印1个*，由于i从0开始，所以令j<=i。        ***
				System.out.print("*") ;                                                                         //   ****
			System.out.println() ;//每一行的最后换行一次。                                                           *****
		}
	}
}
