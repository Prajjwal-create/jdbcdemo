package collectiondemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	 
	    // Obtaining ListIterator
	    ListIterator listIt = linkedlist.listIterator();
	 
	    // Iterating the list in forward direction
	    System.out.println("Forward iteration:");
	    while(listIt.hasNext()){
	       System.out.println(listIt.next());
	    }

	    // Iterating the list in backward direction
	    System.out.println("\nBackward iteration:");
	    while(listIt.hasPrevious()){
	       System.out.println(listIt.previous());

	    }
	    List<String> carList = new LinkedList<String>();
	    carList.add("Audi");
	    carList.add("Jaguar");
	    carList.add("BMW");
	    carList.add("Mini Cooper");
	    System.out.println((carList));

	    //Getting ListIterator
	    ListIterator<String> ltr = carList.listIterator(); 

	    while(ltr.hasNext()){
	      String car = ltr.next();
	      
	      if(car.equals("BMW")) {
	          ltr.add("Mercedes");
	      }
	      if(car.equals("Mini Cooper")) {
	          ltr.set("Camry");
	      }
	    }
	    System.out.println("List elements- " + carList);
	    
	}
}


