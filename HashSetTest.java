import java.util.HashSet;
import java.util.Scanner;

 class Book{
    private String booktitle;
    private String bookauthor;
    private String bookNo;
    private String edition;
    private String NoOfPages;
    private String Price;
    
    public void setmethod(String Booktitle, String Bookauthor,String BookNo2, String Edition2, String NoOfPages2, String Price2)
    {
        this.booktitle=Booktitle;
        this.bookauthor=Bookauthor;
        this.bookNo=BookNo2;
        this.edition=Edition2;
        this.NoOfPages=NoOfPages2;
        this.Price=Price2;
        
        HashSet<String> set = new HashSet<String>();


        set.add(booktitle);
        set.add(bookauthor);
        set.add(bookNo);
        set.add(edition);
        set.add(NoOfPages);
        set.add(Price);

        System.out.println("HashSet: " + set);
        }
        
 
        }
    
   
     
     


public class HashSetTest {
public static void main(String args[])
{
Scanner Obj = new Scanner(System.in);  
    System.out.println("Enter booktitle");

    String booktitle = Obj.nextLine(); 
    System.out.println("Enter bookauthor");
    String bookauthor = Obj.nextLine(); 
    System.out.println("Enter bookNo");
    String bookNo = Obj.nextLine(); 
    System.out.println("Enter edition");
    String edition = Obj.nextLine(); 
    System.out.println("Enter NoOfPages");
    String NoOfPages = Obj.nextLine(); 
    System.out.println("Price");
    String Price = Obj.nextLine(); 
    
    Book book=new Book();
    book.setmethod(booktitle,bookauthor,bookNo,edition,NoOfPages,Price);
    
}
}
    
    
    
    

     
    