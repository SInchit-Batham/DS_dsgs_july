import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
 class TreeMapex {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new TreeMap<Integer,Book>();    
    //Creating Books    
    Book b1=new Book(111,"Communication System","Shravan Khana","BTQ",8);    
    Book b2=new Book(222,"Alogrithms ","Robert Sedgewick","Mc Graw Hill",9);    
    Book b3=new Book(333,"DataBase System Concept","Korth and Sudarshan ","McGraw-Hill Education",6);    
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}
