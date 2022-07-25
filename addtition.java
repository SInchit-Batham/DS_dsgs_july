
public class addtition {

	public static void main(String[] args) {
	Summation ob=new Summation();
	ob.sum();
	ob.sum(5,7);
	ob.sum(5.5,7);
	ob.sum(10,5.5);
	ob.sum(5.5,5.5);

	}

}
 class Summation
 {
	 void sum()
	 {
		 System.out.println("fun0 No adddition is performed");
	 }
	 
	 void sum(int x, int y)
	 {
		 System.out.println(" fun1 total sum is "+ x+y);
	 }
	 void sum(float x, int y)
	 {
		 System.out.println("fun 2 total sum is "+ x+y);
	 }
	 void sum(int x, float y)
	 {
		 System.out.println("fun3 total sum is "+ x+y);
	 }
	 void sum(float x, float y)
	 {
		 System.out.println("fun 4 total sum is "+ x+y);
	 }
 }