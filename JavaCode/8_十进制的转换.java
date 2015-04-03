class  change
{
	
	/*
	十进制-->二进制
	*/
	public static void toBin(int num)
	{
		while(num>0)
		{
			System.out.println(num%2) ;
			num = num / 2 ;
		}
	}

	/*
		十进制-->二进制，查表法
	*/
	public static void toBin_2(int num)
	{
		char[] chs = {'0','1'} ; //定义二进制的表

		char[] arr = new char[32] ; //定义一个临时存储容器，int型共有32个二进制位，所以数组要32个空间。

		int pos = arr.length ;

		while(num!=0)
		{
			arr[--pos] = chs[num & 1] ;
			num = num >> 1 ;
		}

		for(int x = pos; x < arr.length; x++)
			System.out.print(arr[x]) ;
	}

	/*
	十进制-->十六进制
	*/
	public static void toHex(int num)
	{
		for(int x = 0; x < 8; x++)
		{
			int temp = num&15 ; //与15，取最低的4位数
			if(temp>9)          //判断最低4位是否大于9
				System.out.println((char)(temp-10+'A')) ; //如果大于9将其转换为十六进制的A-F的字母形式
			else
				System.out.println(temp) ;
			
			num = num >>> 4 ; //将数无符号右移4位，将所得的数继续循环
		}
	}

	/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F   --->十六进制中的元素

		查表法：将所有的元素临时存储起来，对应关系。
		每一次&15后的值作为索引去查建立好的表，就可以找对应的元素。
		可以通过数组定义表。
	*/

	public static void toHex_2(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		
		for(int x = 0; x<8; x++)
		{
			int temp = num & 15 ;
			System.out.println(chs[temp]) ;

			num = num >>> 4 ;
		}
	}
	
	/*
		由于输出的数组是反着的，所以通过数组完成翻转。
	*/
	public static void toHex_3(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		
		char[] arr = new char[8] ; //定义临时容器，用于翻转。

		int pos = arr.length ; //用于数组下标的移动。
		while(num != 0)
		{
			int temp = num & 15 ;
			arr[--pos] = chs[temp] ; //pos先减1，指向数组的最后一位

			num = num >>> 4 ;
		}

		for(int x = pos; x<arr.length; x++)
		{
			System.out.print(arr[x]+", ") ;
		}
	}

	/*
		定义一个转换函数，适用于十进制和二进制，八进制，十六进制的转还
	*/
	public static void trans(int num, int base, int offset) //num：要转换的数，
	{                                                       //base：num & base,二进制时为1，八进制时为7，十六进制时为15，
		                                                    //offset：要右移的位数，二进制时为1，八进制时为3，十六进制时为4。
		if(num==0)  //如果要转换的数为0，直接打印0，然后退出。
		{
			System.out.println(0) ;
			return ;
		}
		
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		char[] arr = new char[32] ;

		int pos = arr.length ;

		while(num != 0)
		{
			int temp = num & base ;
			arr[--pos] = chs[temp] ;
			num = num >>>offset ; //无符号右移
		}

		for(int x = pos; x<arr.length; x++) //打印输出
			System.out.print(arr[x]) ;

	}


	public static void main(String[] args) 
	{
		
/*		toBin(6) ;
		toBin_2(6) ;
		toHex(60) ;
		toHex_2(60) ; 
		toHex_3(60) ;*/
        trans(6,1,1) ;
		trans(44,7,3) ;
		trans(60,15,4) ;

	}
	

}
