
public class CollegeSystem {

	public static void main(String[] args) {
		
		Student ob=new Student();
		ob.setdetails(sinchit,15230,IT,cse,MnitJaipur);
	}
}
class Student
{
			String name;
			int roll_no;
			String branch;
			String department;
			String college;
			
			void setdetails(String n,int r,String b,String d,String c)
			{
				 name=n;
				roll_no=r;
				 branch=b;
				 department=d;
				 college=c;
				
				System.out.println("name : "+ name);
				System.out.println("Roll No : "+roll_no);
				System.out.println("branch : "+branch);
				System.out.println("Department : "+department);
				System.out.println("name "+ college);
		}
		
		
	

	}



