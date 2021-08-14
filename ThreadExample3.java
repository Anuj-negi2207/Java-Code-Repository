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
}

class ThreadExample3
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t3.setPriority(10);
		t2.setPriority(1);
		t1.setPriority(t2.getPriority()+1);
		System.out.println("Starting Thread 1 - - - ");
		t1.start();
		System.out.println("Starting Thread 2 - - - ");
		t2.start();
		System.out.println("Starting Thread 3 - - - ");
		t3.start();
		System.out.println("Ending the main Thread - - - ");
	}
}