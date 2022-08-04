import java.util.*;  
public class TreemapTest {  
   public static void main(String args[]) {  
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(10,"Sinchit");    
      map.put(12,"Ajay");    
      map.put(10,"Pawan");    
      map.put(6,"Rohit");    
      map.put(2,"Simran");
      System.out.println("Enteries in the treeMap Before Calling the  remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove(12);      
      System.out.println("After Calling remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      
      // Checking for the key_element '10'
        System.out.println("Is the key '10' present?  in the map" );
        if( map.containsKey(20)
           {
              System.out.println(" Yes the Key 20 is present in the map ");
           }
           else
           {
              System.out.println(" No the Key 20 is not present in the map ");
            
           }
           
  
        // Checking for the key_element '25'
           
            System.out.println("Is the key '25' present in the map?");
           
            if( map.containsKey(25))
           {
              System.out.println(" Yes the Key 25 is present in the map ");
           }
           else
           {
              System.out.println(" No the Key 25 is not present in the map ");
            
           }
           
       

      }  
}  
