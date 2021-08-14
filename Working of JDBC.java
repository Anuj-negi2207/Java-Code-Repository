import java.sql.*;		//Contains all the classes to connet Java programs to the database  
import java.util.*;
class Mysqlfunc
{
	public boolean checkDuplicate(Connection con, String rollNo)
	{
		boolean flag = true;
		try
		{
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
			ResultSet rs = stmt.executeQuery("select Name from StudentNew where RollNo = '" + rollNo + "'");

			boolean f = rs.next();
			if(rs.getRow()>0)
				System.out.println("Roll number you added matches to Student Name: " + rs.getString(1));
			
			else
				flag = false;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return flag;
	}


	public void giveTheSingleInput(Connection con)
	{
		try
		{  
			PreparedStatement pstmt = con.prepareStatement("insert into StudentNew values(?,?,?,?)");  
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Name : ");
			pstmt.setString(1, sc.nextLine());
			
			System.out.print("Enter RollNo : ");
			String rollNo = sc.nextLine();
			pstmt.setString(2, rollNo);
			
			if(checkDuplicate(con, rollNo) == false)
			{
				System.out.print("Enter Address : ");
				pstmt.setString(3, sc.nextLine());
				
				System.out.print("Enter CGPA : ");
				pstmt.setString(4, sc.nextLine());
				

				int i = pstmt.executeUpdate();  
				System.out.println(i+" records inserted");
			}
			   
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
	}


	public void displayTheValues(Connection con, String orderby)
	{
		try
		{
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
			ResultSet rs = stmt.executeQuery("select * from StudentNew order by " + orderby);

			rs.beforeFirst();
			while(rs.next())
			{
				System.out.print("\n\t|\t" + rs.getString("Name") + "      ");
				System.out.print("\t\t|\t" + rs.getString("RollNo") + "      ");
				System.out.print("\t|\t" + rs.getString("Address") + "      ");
				System.out.print("\t\t|\t" + rs.getFloat("CGPA") + "      " + "\n");
			}
			System.out.println("All records Printed\n");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void displayTheValues(Connection con)
	{
		displayTheValues(con, "NULL"); //if orderby is not passed
	}

}

class JDBC_Assignment_19BAI10021
{
	public static void main(String[] args) 
	{
		Mysqlfunc m = new Mysqlfunc();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","22072000");  

			System.out.println("Checking the values inside the Table StudentNew\n");
			m.displayTheValues(con);

			System.out.println("\n\nEntering a new value");		//A unique entry
			m.giveTheSingleInput(con);

			System.out.println("\n\nEntering another value");	//will enter same entry with another roll number
			m.giveTheSingleInput(con);

			System.out.println("\n\nChecking the values inside the Table StudentNew in increasing order of CGPA\n");
			m.displayTheValues(con, "CGPA");

			con.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
	