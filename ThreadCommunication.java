import java.util.*;

class Demo
{
	int value = 0;
	synchronized void outputValue()
	{
		System.out.println("outputValue() invoked for displaying value on screen. . . ");
		if(value == 0)
		{
			System.out.println("Waiting for a non-zero value. . . ");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("The value input is : "+value);
	}
	synchronized void inputValue()
	{
		System.out.println("inputValue() invoked for setting the value. . . ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		System.out.println("Value received. . . ");
		
		notify();
	}
}

class Thread1 extends Thread
{
	Demo d1;
	Thread1(Demo d)
	{
		d1 = d;
	}
	public void run()
	{
		d1.inputValue();
	}
}

class Thread2 extends Thread
{
	Demo d2;
	Thread2(Demo d)
	{
		d2 = d;
	}
	public void run()
	{
		d2.outputValue();
	}
}

class ThreadCommunication
{
	public static void main(String args[])
	{
		Demo demo1 = new Demo();
		Thread1 t1 = new Thread1(demo1);
		Thread2 t2 = new Thread2(demo1);
		
		
		t2.start();
		t1.start();
		
	}
}