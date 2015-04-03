/*
�̼߳�ͨѶ��
��ʵ���Ƕ���߳��ڲ���ͬһ����Դ��
���ǲ����Ķ�����ͬ��

*/

class Res
{
	private String name ;
	private String sex ;
	private boolean flag = false ;

	public synchronized void set(String name, String sex)
	{
		if(flag)
			try{this.wait() ;}catch(Exception e){}
		this.name = name ;
		this.sex = sex ;
		flag = true ;
		this.notify() ;//ֻ��ͬһ�����ϵı��ȴ��̣߳�ֻ���Ա�ͬһ������notify���ѡ�������this
	}
	public synchronized void out()
	{
		if(!flag)
			try{this.wait() ;}catch(Exception e){}
		System.out.println(name + ".........." + sex) ;
		flag = false ;
		this.notify() ;
	}
}

class Input implements Runnable
{
	private Res r ;
	Input(Res r)
	{
		this.r = r ;
	}
	public void run()
	{
		int x = 0 ;
		while(true)
		{
				if(x == 0)
					r.set("mike", "man") ;
				else
					r.set("����", "Ů") ;
				x = (x + 1) % 2 ;
		}
	}
}

class Output implements Runnable
{
	private Res r ;
	Output(Res r)
	{
		this.r = r ;
	}
	public void run()
	{
		while(true)
		{
			r.out() ;
		}
	}
}

class InputOutputDemo
{
	public static void main(String[] args)
	{
		Res r = new Res() ;
/*
		Input in = new Input(r) ;
		Output out = new Output(r) ;

		Thread t1 = new Thread(in) ;
		Thread t2 = new Thread(out) ;

		t1.start() ;
		t2.start() ;
*/
		new Thread(new Input(r)).start() ;
		new Thread(new Output(r)).start() ;

	}
}


//notifyAll();

/*
wait:
notify();
notifyAll();

��ʹ����ͬ���У���ΪҪ�Գ��м�����(��)���̲߳�����
����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������

Ϊʲô��Щ�����̵߳ķ���Ҫ����Object�����أ�
��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������߳�ֻ�е�����
ֻ��ͬһ�����ϵı��ȴ��̣߳�ֻ���Ա�ͬһ������notify���ѡ�
�����ԶԲ�ͬ���е��߳̽��л��ѡ�

Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������

��������������������Կ��Ա����������õķ���ֻ�ܶ���Object���С�

*/
