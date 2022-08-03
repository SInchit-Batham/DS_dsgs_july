 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest 
{
	public static void main(String[] args) throws EmployeeAllReadyExitException 
	{ 
try 
		{
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?);");
			System.out.println("Prepared Statement created : "+pst);
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter employee number : ");
			int eno = scan1.nextInt(); 
				
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE empno="+eno);
			System.out.println("Statement executed, got the result....");
								
			if(rs.next()) 
			{
					EmployeeAllReadyExitException empNotEx =new EmployeeAllReadyExitException("Employee All ready exit "+eno);
					throw empNotEx;
			}
							
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter employee name   : ");
			String ename = scan2.next();
							
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter employee salary : ");
			int esal = scan3.nextInt();
							
			pst.setInt(1, eno);
			pst.setString(2, ename);
			pst.setInt(3, esal);
							
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate(); 
				 
  
			System.out.println("Prepred Statement executed, inserted the records :..."+rows);

			rs.close();	
			pst.close();	
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
												    
	}
} 
				 

 
