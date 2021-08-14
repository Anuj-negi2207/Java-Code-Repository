interface MyNumber
{
	double getValue(int i);
}

class LambdaExprDemo
{
	public static void main(String[] args)
	{
		MyNumber num;
		int a = 10;
		
		num = (int b) -> {
			b = b+2;
			return 2*b;
		};	// Means that I am implementing the method of functional interface MyNumber
		// it translates to: public double getValue(){return 123.45;}
		System.out.println("The value is : "+num.getValue(a));
		
		num = (int b) -> Math.random() * b;	// leads to creation of another anonymous class
		System.out.println("The second value is : "+num.getValue(a));
		
		//num = () -> "Hello";	//The lambda expression must be compatible with the method declaration
		//System.out.println("The second value is : "+num.getValue());
	}
}