import java.util.*;

class Matrix
{
	int[][] M = new int[4][4];


	Matrix()		//Making default values as zero
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				M[i][j] = 0;
			}			
		}
	}


	public void getData()
	{
		System.out.println("Give the input to this Matrix: ");
		Scanner sc=new Scanner(System.in);  

		for(int i=0; i<4; i++)
		{
			System.out.print((i+1) + " Row:\n");
			for(int j=0; j<4; j++)
			{
				System.out.print("\n\t" + (j+1) + " Column: ");
				M[i][j] = sc.nextInt();
			}
			System.out.println("\n\n");
		}
	}

	public void Addition(Matrix Other)
	{
		System.out.println("\n\nAdding the Matrices\n");

		Matrix Added = new Matrix();

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{			
				Added.M[i][j] = this.M[i][j]+Other.M[i][j];
			}
		}

		Added.PrintTheMatrix2();
	}

	public void Multiplication(Matrix Other)
	{
		System.out.println("\n\nAs both of the Matrix have the order of 4X4, Hence, Multiplication is possible\n");

		Matrix Multiplied = new Matrix();

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				int temp = 0;
				for(int k = 0; k<4; k++)
				{
					temp += this.M[i][k]*Other.M[k][j];
				}
				Multiplied.M[i][j] = temp;
			}
		}

		Multiplied.PrintTheMatrix2();
	}

	public void Transpose()
	{
		System.out.println("\n\nTransposed the Matrix\n");
		Matrix Transposed = new Matrix();

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{			
				Transposed.M[i][j] = this.M[j][i];
			}
		}

		Transposed.PrintTheMatrix2();
	}

	public int[] SortingAlg(int[] L)
	{
		for(int i=0; i<4; i++)
		{
			for(int j=i; j<4; j++)
			{
				if(L[i]>L[j])
				{
					int temp = L[i];
					L[i] = L[j];
					L[j] = temp;
				}
			}
		}
		return L;
	}

	public void SortRows()
	{
		System.out.println("\n\nSorted the Matrix\n");
		for(int i=0; i<4; i++)
		{
			int[] temp = new int[4];
			for(int j=0; j<4; j++)
			{
				temp[j] = this.M[i][j];			
			}

			temp = SortingAlg(temp);

			for(int j=0; j<4; j++)
			{
				this.M[i][j] = temp[j];			
			}
		}

		this.PrintTheMatrix2();
	}
	
	public void PrintTheMatrix1()
	{
		System.out.println("\nPrinting the Matrix\n\n");

		for(int i=0; i<4; i++)
		{
			System.out.print("\t\t");
			for(int j=0; j<4; j++)
			{
				System.out.println("Row " + (i+1) + " Column " + (j+1) + " :\t" + this.M[i][j]);
			}
		}
	}

	public void PrintTheMatrix2()
	{
		System.out.println("\nPrinting the Matrix\n\n");

		for(int i=0; i<4; i++)
		{
			System.out.print("\t\t");
			for(int j=0; j<4; j++)
			{
				System.out.print(this.M[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}

class MatrixOperation
{
	public static void main(String[] args) 
	{
		Matrix M1 = new Matrix();
		Matrix M2 = new Matrix();

		M1.getData();
		M2.getData();

		M1.Addition(M2);
		M1.Multiplication(M2);
		M1.Transpose();
		M1.SortRows();
	}
}