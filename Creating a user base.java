import java.util.*;


class Data
{
	String name;
	String dob;
	String email;
	String address;

	Data()
	{
		name = new String();
		dob = new String();
		email = new String();
		address = new String();
	}

	public void getData(int i)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Data for the Person " + (i+1) );
		System.out.print("Name- \t");
		this.name = sc.nextLine();
		System.out.print("DoB (dd/mm/yyyy)- \t");
		this.dob  = sc.nextLine();
		System.out.print("Email - \t");
		this.email = sc.nextLine();
		System.out.print("Address - \t");
		this.address = sc.nextLine();
	
	}

	public void Equals(Data[] D,int startFrom, int endAt, int indexOfObject)
	{
		int count = 0;

		for(int i = startFrom; i < endAt; i++)
		{
			if(i == indexOfObject)
				continue;

			else if(this.name.equalsIgnoreCase(D[i].name))
				{
					if(this.dob.equalsIgnoreCase(D[i].dob))
					{
						if(this.email.equalsIgnoreCase(D[i].email))
						{
							if(this.address.equalsIgnoreCase(D[i].address))
							{
								System.out.println("\nPerson " + (indexOfObject+1) + " is same as of People " + (i+1));
								count++;
							}
						}
					}
				}
			
		}

		if(count == 0)
			System.out.println("No Same Data");
		
	}

	public void Equals(Data d)
	{
		if(this.name.equalsIgnoreCase(d.name))
		{
			if(this.dob.equalsIgnoreCase(d.dob))
			{
				if(this.email.equalsIgnoreCase(d.email))
				{
					if(this.address.equalsIgnoreCase(d.address))
					{
						System.out.print("Both Person have same data");
					}
				}
			}
		}

		else
			System.out.print("No same data");
	}

}

class DATAtest_19BAI10021
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of data you want to enter: ");
		int n = sc.nextInt();

		Data[] d = new Data[n];

		for(int i = 0;i<n; i++)
		{
			d[i] = new Data();
			d[i].getData(i);
		}

		d[0].Equals(d, 1, n, 0);

		d[0].Equals(d[1]);
	}
	
}