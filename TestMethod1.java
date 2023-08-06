package TestMethod1;

class TestMethod1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try	
			{
				System.out.println("running thread name is:"+Thread.currentThread().getName());
				System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
	TestMethod1 t0=new TestMethod1();
	TestMethod1 t1=new TestMethod1();
	TestMethod1 t2=new TestMethod1();
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t0.start();
	try
	{
		t0.join();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	t1.start();
	t2.start();
}
}
