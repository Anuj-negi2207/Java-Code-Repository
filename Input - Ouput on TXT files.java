import java.io.*;

class AssignmentFunction
{

	void createFile(String filename, String data)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(filename);
			DataOutputStream dout = new DataOutputStream(fos);
			dout.writeUTF(data);
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}


	int countCharacters(String filename)
	{
		
		int count = 0;
		try
		{
			FileInputStream fin = new FileInputStream(filename);
			int b;
			while((b = fin.read()) != -1)
			{
				count++;
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		return count;
	}


	int countWhiteSpace(String filename)
	{
		
		int count = 0;
		try
		{
			FileInputStream fin = new FileInputStream(filename);
			int b; 
			
			while((b = fin.read()) != -1)
			{
				if((char)b == ' ')
					count++;
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		return count;
	}


	void appCharacters(String filename, int data)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(filename, true);
			DataOutputStream dout = new DataOutputStream(fos);
			String str = String.valueOf(data);
			dout.writeUTF(str);
			fos.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

	void readFile(String filename)
	{
		
		try
		{
			int b;
			FileInputStream fin = new FileInputStream(filename);
			while((b = fin.read()) != -1)
			{
				System.out.print((char)b);
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}

class AssignmentI_O_19BAI10021
{
	public static void main(String[] args) 
	{
		AssignmentFunction obj = new AssignmentFunction();

		String filename = "AssignmentTXT.txt";
		String data = "Hey, this is just a random sentence that I'm using to see how my code works ";
		obj.createFile(filename, data);

		System.out.println("After Creating File, reading it:\n");
		obj.readFile(filename);

		System.out.println("\nTotal Character in the file:\t " + obj.countCharacters(filename));
		System.out.println("\nTotal White Spaces in the file:\t " + obj.countWhiteSpace(filename));

		System.out.println("\nNow Appending the Character in file");
		
		int count = obj.countCharacters(filename);
		
		obj.appCharacters(filename, count);
		
		System.out.println("\nReading the file again \n");
		obj.readFile(filename);

	}
}