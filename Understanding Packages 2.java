//package Documents;
//import package1.*;
//import package1.package2.*;

class Example 
{
	private void display()
	{
		System.out.println("\nWe are right now in First class, under 'Private', being called by object of Second Class!!! HURRAY!\n");
		System.out.println("_________________________________________________________________________________________________");
	}
}
class Example1 
{
	public void show()
	{
		Example e = new Example();
		e.display();
	}
}

class PackageTest2
{
	public static void main(String args[])
	{
		Example1 e1 = new Example1();

		System.out.println("\n\nHere we have called a function under 'Private' using object of Second Class. Let's See If It works!!!\n");
		e1.show();

	}
}