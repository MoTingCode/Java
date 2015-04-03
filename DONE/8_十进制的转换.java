class  change
{
	
	/*
	ʮ����-->������
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
		ʮ����-->�����ƣ����
	*/
	public static void toBin_2(int num)
	{
		char[] chs = {'0','1'} ; //��������Ƶı�

		char[] arr = new char[32] ; //����һ����ʱ�洢������int�͹���32��������λ����������Ҫ32���ռ䡣

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
	ʮ����-->ʮ������
	*/
	public static void toHex(int num)
	{
		for(int x = 0; x < 8; x++)
		{
			int temp = num&15 ; //��15��ȡ��͵�4λ��
			if(temp>9)          //�ж����4λ�Ƿ����9
				System.out.println((char)(temp-10+'A')) ; //�������9����ת��Ϊʮ�����Ƶ�A-F����ĸ��ʽ
			else
				System.out.println(temp) ;
			
			num = num >>> 4 ; //�����޷�������4λ�������õ�������ѭ��
		}
	}

	/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F   --->ʮ�������е�Ԫ��

		����������е�Ԫ����ʱ�洢��������Ӧ��ϵ��
		ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����Ҷ�Ӧ��Ԫ�ء�
		����ͨ�����鶨���
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
		��������������Ƿ��ŵģ�����ͨ��������ɷ�ת��
	*/
	public static void toHex_3(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		
		char[] arr = new char[8] ; //������ʱ���������ڷ�ת��

		int pos = arr.length ; //���������±���ƶ���
		while(num != 0)
		{
			int temp = num & 15 ;
			arr[--pos] = chs[temp] ; //pos�ȼ�1��ָ����������һλ

			num = num >>> 4 ;
		}

		for(int x = pos; x<arr.length; x++)
		{
			System.out.print(arr[x]+", ") ;
		}
	}

	/*
		����һ��ת��������������ʮ���ƺͶ����ƣ��˽��ƣ�ʮ�����Ƶ�ת��
	*/
	public static void trans(int num, int base, int offset) //num��Ҫת��������
	{                                                       //base��num & base,������ʱΪ1���˽���ʱΪ7��ʮ������ʱΪ15��
		                                                    //offset��Ҫ���Ƶ�λ����������ʱΪ1���˽���ʱΪ3��ʮ������ʱΪ4��
		if(num==0)  //���Ҫת������Ϊ0��ֱ�Ӵ�ӡ0��Ȼ���˳���
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
			num = num >>>offset ; //�޷�������
		}

		for(int x = pos; x<arr.length; x++) //��ӡ���
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
