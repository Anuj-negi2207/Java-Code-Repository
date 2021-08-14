import java.util.*;

class Marks
{
	int[] Sub = new int[5];
	double Percentage;
	static int[] Total = new int[5];
	char Grade;

	Marks()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks of the student");

		for(int i = 0; i<5; i++)
		{
			System.out.println();
			System.out.println("\t\tEnter marks in subject " + (i+1));
			System.out.print("\t\t-> ");

			int temp = sc.nextInt();

			this.Sub[i] = temp;
			this.Percentage += (double) temp;
			this.Total[i] = Total[i] + temp;	//Because total will have 0 as predefined value
		}

		Percentage /= 5.0;
	}

	void Assign_Grade()
	{
		double mark;
	
		mark = Percentage;

		if ( mark > 89)
			Grade = 'S';

		else if (mark>79 && mark<90)
			Grade = 'A';

		else if (mark>69 && mark<80)
			Grade = 'B';

		else if (mark>59 && mark<70)
			Grade = 'C';

		else if (mark>49 && mark<60)
			Grade = 'D';

		else if (mark>39 && mark<50)
			Grade = 'E';

		else if (mark>29 && mark<40)
			Grade = 'P';

		else
			Grade = 'F';

	}

}


class Student extends Marks
{	
	static int number_of_student; 
	int Roll_n, Semester;
	String Name, Degree;

	Student(int Roll_n, String Name, String Degree, int Semester)
	{	
		super();

		number_of_student++;

		this.Roll_n = Roll_n;

		this.Name = Name;

		this.Degree = Degree;

		this.Semester = Semester;
	}

	public static void Average_marks()  //To return average marks of the class assuming 'index'= subject number.
	{
		double temp;

		for(int i=0; i<5; i++)
		{
			temp = Total[i]/number_of_student;

			System.out.println("Average marks in Subject " + (i+1) + " =  " + temp);
		}
		
	}

	public static void Percentage_Sorting(Student S[], int n) //list of students, number of students 
	{
		Student temp;

		for(int i= (n-1); i>0; i--)
		{
			for(int j = 0; j<i; j++) 
			{
				if(S[j].Percentage>S[j+1].Percentage)
				{
					temp = S[j];
					S[j] = S[i];
					S[i] = temp;
				}
			}
		}
	}


	public static void Display_details(Student S[], int n)
	{
		
		System.out.println("Roll number\t\tName\t\t\t\tDegree\t\tSemester\t\tPercentage");

		for(int i=0; i<n; i++)
		{
			System.out.println(S[i].Roll_n + "\t\t\t" + S[i].Name + "\t\t\t" + S[i].Degree + "\t\t" + S[i].Semester + "\t\t\t" + S[i].Percentage);
		}

		System.out.println("The Average Marks in each subject");
		Student.Average_marks();

	}

	public static void Display_details_with_grades(Student S[], int n)
	{	
		char[] list = {'S', 'A', 'B', 'C', 'D', 'E', 'P', 'F'};//Took help from internet for this line

		for(int j= 0; j<8; j++)
		{
			System.out.println("All Students with Grade " + list[j]);
			System.out.println();
			System.out.println("Roll number\t\tName\t\t\t\tDegree\t\tSemester\t\tGrade"); 
			for(int i=0; i<n; i++)
			{	
				S[i].Assign_Grade();

				if(S[i].Grade == list[j])
					System.out.println(S[i].Roll_n + "\t\t\t" + S[i].Name + "\t\t\t" + S[i].Degree + "\t\t" + S[i].Semester + "\t\t\t" + S[i].Grade);
			}	
			System.out.println("\n");
		}
		
	}
}

class StudentGrade
{
	public static void main(String[] args)
	{

		int roll_n, semester;
		String name, degree;

		
		Student S[] = new Student[2];

		//int[] mark = {12, 45, 78, 56, 98};
		S[0] = new Student(1, "AA", "CSE", 4);

		//int[] mark = {45, 95, 78, 12, 63};
		S[1] = new Student(2, "AB", "CSE", 4);

		//int[] mark = {23, 82, 69, 52, 45};
		//S[2] = new Student(3, "AC", "CSE", 4, 3);

		//int[] mark = {10, 78, 96, 32, 75};
		//S[3] = new Student(4, "AD", "CSE", 4, 4);

		//int[] mark = {45, 85, 79, 39, 44};
		//S[4] = new Student(5, "AE", "CSE", 4, 5);


		Student.Percentage_Sorting(S, 2);

		Student.Display_details(S, 2);

		Student.Display_details_with_grades(S, 2);

	}
}