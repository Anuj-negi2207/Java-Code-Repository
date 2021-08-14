class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 1; i<= 5; i++)
		{
			System.out.println("From Thread - 1 : i = "+i);
		}
		System.out.println("Exiting Thread - 1");
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for(int j = 1; j<= 5; j++)
		{
			System.out.println("From Thread - 2 : j = "+j);
		}
		System.out.println("Exiting Thread - 2");
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		for(int k = 1; k<= 5; k++)
		{
			System.out.println("From Thread - 3 : k = "+k);
		}
		System.out.println("Exiting Thread - 3");
	}
	public void myRun()
	{
		for(int k = 1; k<= 5; k++)
		{
			System.out.println("From Thread - 3 (myRun) : k = "+k);
		}
		System.out.println("Exiting Thread - 3 (myRun)");
	}
}

class ThreadExample1
{
	public static void main(String args[])
	{
		System.out.println("Starting the main thread - - - ");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
		
		t3.myRun();
		
		//t1.run();
		//t2.run();
		//t3.run();
		System.out.println("Ending the main thread - - - ");
	}
}