/*
public static void main(String[] args) 
����������һ������ĺ�������Ϊ�������ڣ����Ա�JVM���á�
�������Ķ��壺
public������ú����ķ���Ȩ��������
static������������������ļ��ؾ��Ѿ�������
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�JVMʶ��
(String[] arr)���������Ĳ���������������һ�����飬�������е�Ԫ�����ַ��������ַ������͵����顣
�������ǹ̶���ʽ�ģ�JVMʶ����������Ψһ���ԸĶ�����args��arguments���������ǿ��Ըĵġ�

JVM�ڵ���������ʱ���������new String[0]
�����ֶ��������������������������java����ʱ���������������������������ÿո�����
javac 13_main.java
java MainDemo haha hehe heihei hiahia xixi

������JVM�ͻὨ��һ������Ϊ5���ַ�������args��
������args[0]="haha",args[1]="hehe",args[2]="heihei",args[3]="hiahia",args[4]="xixi"
*/
class  MainDemo
{
	public static void main(String[] args) //����Ĳ���argsֻ�����ֿ��ܣ�new String[]����null��
	{
		System.out.println(args); //֤����new String[]
		System.out.println(args.length) ;//֤����new String[0]
		for(int x = 0; x < args.length; x++)
			System.out.println(args[x]) ;
	}
}