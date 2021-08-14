// Using yield(), stop() and sleep() methods
class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 1; i<= 5; i++)
		{
			if(i == 4)
			{
				Thread.yield();	//yield() is a static method
			}
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
			if(j == 3)
			{
				stop();
			}
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
			if(k == 2)
			{
				try
				{
					sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println("Exception here!!");
				}
			}
			System.out.println("From Thread - 3 : k = "+k);
		}
		System.out.println("Exiting Thread - 3");
	}
}

class ThreadExample2
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		System.out.println("Start Thread 1 - - - - ");
		t1.start();
		System.out.println("Start Thread 2 - - - - ");
		t2.start();
		System.out.println("Start Thread 3 - - - - ");
		t3.start();
		System.out.println("End of the main thread...");
		
	}
}