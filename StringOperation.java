import java.util.*;

class StringOperation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String s = new String();

		System.out.print("Please Enter a sentence of your choice:\t");
		s = sc.nextLine();

		StringBuffer temp = new StringBuffer();
		int count = 0;

		for(int i = 0; i<s.length(); i++)
		{
			
			{
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					temp.append(s.charAt(i));
					if(s.charAt(i+1) == ' ' || s.charAt(i+1) == '\t')
					{
						count++;
					}

				}

				else if(s.charAt('a') >= 97 && s.charAt(i) <= 'b')
				{
					temp.append(s.charAt(i));
					if(s.charAt(i+1) == ' ' || s.charAt(i+1) == '\t')
					{
						count++;
					}
				}
			}

			if(count == 2)
			{
				break;
			}
		}

		System.out.println("String = " + s);		
	
		System.out.println("Second word with it's length - " + temp + "(" + temp.length() + ")");		
	}
}