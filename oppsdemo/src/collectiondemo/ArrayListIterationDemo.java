package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> names=new ArrayList<String>();
         
         names.add("james");
         names.add("micheal");
         names.add("jin");
         names.add("robert");
         
         System.out.println(names);
         //iterator interface for traversing
         Iterator<String> itr=names.iterator();
         while(itr.hasNext())
         {
        	 System.out.println(itr.next());
        	 
         }
         System.out.println(names.get(1));
         names.add(3,"raj"); //adding element in specified index
          names.remove(0); //delete forst elemnrt
          names.set(1, "java"); //replace exiting element
          
          System.out.println(" ***display collection using for each lopp****");
          for( String i:names)
          {
        	  System.out.println(i);
          }
          
          ArrayList<Double> marks=new ArrayList<Double>();
          marks.add(999.45);
          marks.add(500.20);
          marks.add(768.25);
          marks.add(871.90);
          marks.add(450.45);
          System.out.println();
          for(Double i:marks)
          {
        	  System.out.println(i);
          }
	}

}
