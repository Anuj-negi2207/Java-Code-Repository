//package Documents;
import package1.*;
import package1.package2.*;

class Example extends ClassA1
{
	public void show()
	{
		Example e = new Example();
		e.displayA();
	}
}
class Example1 extends ClassB1
{
	public void show()
	{
		Example1 e1 = new Example1();
		e1.displayB();
	}
}

class PackageTest3
{
	public static void main(String args[])
	{
		Example e = new Example();
		Example1 e1 = new Example1();

		System.out.println("\n\nClasses A1 and B1 are already compiled!!\n");

		System.out.println("\n\nHere we have called a function under 'Private' of a class in another package extended to Example class. Let's See If It works!!!\n");
		e.show();

		System.out.println("\n\nHere we have called a function under 'Private' of a class in another package extended to Example1 class. Let's See If It works!!!\n");
		e1.show();

	}
}