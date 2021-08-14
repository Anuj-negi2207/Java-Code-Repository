// Demostrates that lambda expressions can be passed as arguments

interface MyInterface
{
	String fun(String n);
}

class LambdaExprMethod
{
	static String stringOperation(MyInterface mi, String a)
	{
		return mi.fun(a);
	}
	public static void main(String[] args)
	{
		String inputStr = "Hello";
		String outputStr;
		outputStr = stringOperation((str) -> str.toUpperCase(),inputStr);
		System.out.println(outputStr);
	}
}