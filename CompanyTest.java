import java.util.Scanner;

public class CompanyTest {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String deptName=s.next();
		String Location=s.next();
		
		company c=new company();
		c.setdeptName(deptName);
		c.setLocation(Location);
		
		System.out.println("DeptName is :" + c.getdeptName());
		System.out.println("DeptID is :"+ c.GetgenerateID());
		System.out.println("DeptLocation is : "+ c.getLocation());
		System.out.println("No of Employees is :"+ c.getNumberOfEmployees());
		

	}

}

class company
{
	private String deptName;
	private static int ID=0;
	private int id;
	private String Location;
	int NumberOfEmployees;
	public String getdeptName() {
		return deptName;
	}
	public void setdeptName(String companyName) {
		this.deptName = companyName;
	}
	public int getID() {
		return ID;
	}
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	public void setNumberOfEmployees()
	{
		NumberOfEmployees=0;
	}
	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}
	
	public int GetgenerateID()
	{
		ID=ID+10;
		this.id=ID;
		return id;
		
	}

	
	
	

}
