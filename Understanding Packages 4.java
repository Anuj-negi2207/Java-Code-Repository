//package Documents;
import package1.*;
import package1.package2.*;

class Example
{
	public void show()
	{
		ClassA2 a = new ClassA2();
		a.displayA();
	}
}
class Example1
{
	public void show()
	{
		ClassB2 b = new ClassB2();
		b.displayB();
	}
}

class PackageTest4
{
	public static void main(String args[])
	{
		Example e = new Example();
		Example1 e1 = new Example1();

		System.out.println("\n\nClasses A2 and B2 are already compiled!!\n");

		System.out.println("\n\nHere we have called a function under 'Friendly (default)' of a class in another package. Let's See If It works!!!\n");
		e.show();

		System.out.println("\n\nHere we have called a function under 'Friendly (default)' of a class in another package. Let's See If It works!!!\n");
		e1.show();

	}
}