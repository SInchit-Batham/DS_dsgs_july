import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {


		Map<String, String> fruits = new HashMap<>();
		fruits.put("Green", "Guava");
		fruits.put("yellow", "banana");
		fruits.put("white", "radish");
		fruits.put("Red", "apple");

		if(fruits.containsKey("red"))
		{ 
			System.out.println("Key is present in the Hash Map");
		}
		else
		{
			System.out.println("Key is not present in the Hash Map");
		}
      	if(fruits.containsValue("apple"))
      	{
      		System.out.println("Value is present in the Hash Map");
      	}
      	
      	else
		{
			System.out.println("Value is not present in the Hash Map");
		}
      		
      		
      		System.out.println("the size of the fruit is :" + fruits.size());		 
      	    
      		System.out.println("Removing the Red Key along with its value");
		fruits.remove("red"); 
		System.out.println("Red Key entry is removed from the hash map");


		System.out.println(fruits.get("red"));

		for (Map.Entry pairEntry: fruits.entrySet()) {
			System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		}
	}
}

.............................................................. 
