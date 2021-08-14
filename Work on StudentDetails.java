//By - 19BAI10021, Anuj Singh Negi

import java.util.*;

class Marks
{
	int[] Sub = new int[5];
	double Percentage;
	static int[] Total = new int[5];
	char Grade;

	Marks(int[] mark)
	{
		
		for(int i = 0; i<5; i++)
		{	
			int temp = mark[i];

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

	Student(int Roll_n, String Name, String Degree, int Semester, int[] mark)
	{	
		super(mark);

		number_of_student++;

		this.Roll_n = Roll_n;

		this.Name = Name;

		this.Degree = Degree;

		this.Semester = Semester;

		System.out.println("\n\t-> Details of Roll number - " + Roll_n + " is complete");
	}

	public static void Average_marks()  //To return average marks of the class assuming 'index'= subject number.
	{
		double temp;

		for(int i=0; i<5; i++)
		{
			temp = Total[i]/number_of_student;

			System.out.println("\n\t\t -> Average marks in Subject " + (i+1) + " =  " + temp);
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
		
		System.out.println("\t\tRoll number\t\tName\t\t\tDegree\t\tSemester\t\tPercentage");

		for(int i=0; i<n; i++)
		{
			System.out.println("\t\t" + S[i].Roll_n + "\t\t\t" + S[i].Name + "\t\t\t" + S[i].Degree + "\t\t" + S[i].Semester + "\t\t\t" + S[i].Percentage);
		}

		System.out.println("\n\n________________________________________________________ \n");
		System.out.println("\t\tThe Average Marks in each subject");
		Student.Average_marks();

	}

	public static void Display_details_with_grades(Student S[], int n)
	{	
		char[] list = {'S', 'A', 'B', 'C', 'D', 'E', 'P', 'F'};//Took help from internet for this line

		for(int j= 0; j<8; j++)
		{
			System.out.println("\n\n________________________________________________________ \n");
			System.out.println("All Students with Grade " + list[j]);
			System.out.println("\n\t\tRoll number\t\tName\t\t\tDegree\t\tSemester\t\tGrade"); 

			int flag = 0;

			for(int i=0; i<n; i++)
			{	
				S[i].Assign_Grade();

				if(S[i].Grade == list[j])
					System.out.println("\t\t" + S[i].Roll_n + "\t\t\t" + S[i].Name + "\t\t\t" + S[i].Degree + "\t\t" + S[i].Semester + "\t\t\t" + S[i].Grade);
				
				else
					flag = 1;
			}	

			if(flag == 1)
				System.out.println("\t\t!!! NO DATA !!!");

			System.out.println("\n");
		}
		
	}
}

class StudentDetails
{
	public static void main(String[] args)
	{

		int roll_n, semester;
		String name, degree;

		
		Student S[] = new Student[5];

		int[] mark = {90, 48, 78, 89, 95};
		S[0] = new Student(1, "AA", "CSE", 4, mark);

		int[] mark1 = {45, 95, 78, 12, 63};
		S[1] = new Student(2, "AB", "CSE", 4, mark1);

		int[] mark2 = {23, 82, 69, 52, 45};
		S[2] = new Student(3, "AC", "CSE", 4, mark2);

		int[] mark3 = {10, 78, 96, 32, 75};
		S[3] = new Student(4, "AD", "CSE", 4, mark3);

		int[] mark4 = {45, 85, 79, 39, 44};
		S[4] = new Student(5, "AE", "CSE", 4, mark4);


		Student.Percentage_Sorting(S, 5);

		System.out.println("\n\n________________________________________________________ \n\n");
		System.out.println("\n\nDetails of the Student with Percentage - \n\n");
		Student.Display_details(S, 5);

		System.out.println("\n\n________________________________________________________ \n\n");
		System.out.println("\n\nDetails of the Student, grouping with Grade - \n\n");
		Student.Display_details_with_grades(S, 5);

	}
}