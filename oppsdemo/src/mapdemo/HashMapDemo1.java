package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);
	// // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("Value at index 3: " +languages);
	    
	    //return set of keys
	    System.out.println("key"+languages.keySet());
	    
	    //retrn set of value

	System.out.println("values:" +languages.values());
	
	//reteurn set of key vaue pairs
	System.out.println("Key value mapping:" +languages.entrySet());
	languages.replace(2,"c++");
	//iterate true keys
	System.out.println("Key:");
	for(Integer k:languages.keySet())
	{
		System.out.println(k+"--->"+languages.get(k));
		
	}
	System.out.println("entries:");
	for(Entry<Integer, String> entry:languages.entrySet())
	{
		System.out.println(entry);
	}
	
	
	}

}
