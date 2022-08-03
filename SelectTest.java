import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.hsqldb.Statement;

public class SelectTest {

	public static void main(String[] args)
	{
		try
		{
		System.out.println("Registering Driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered");
		System.out.println("trying to connect tot the DB");
		
		Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA", "");
		java.sql.Statement stmt=conn.createStatement();
				System.out.println("connected to the DB "+ conn);
		
		System.out.println("Trying to make a statement");
		System.out.println("trying to excecute the statement");
		PreparedStatement rs= .preparedStatement("INSERT INTO EMPLOYEE");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee number");
		int eno=scan.nextInt();
		ResultSet rs= Statement.executeQuery("Select * from EMPLOYEE WHERE EMPNO"+ eno);
		System.out.println("Stament executed, got the result..");
		
		if(rs.next())
		{
		  int empno=rs.getInt(1);
		  String ename=rs.getString(2);
		  System.out.println("EMP NO :"+empno);
		  System.out.println("EMP NAME : "+ ename);
		  System.out.println("EMP SAL :"+ sal);
		  System.out.println("-------------------");
		}
		else
		{
			EmployeeNotFoundException enf=new EmployeeNotFoundException("employee number not found");
			throw enf;
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
