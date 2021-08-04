package collectiondemo;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack<String> s=new Stack<String>();
         
         s.push("Mike");
         s.push("john");
         s.push("aman");
         s.push("singh");
         s.push("mary");
         System.out.println("remove element :"+s.pop());
         
         Iterator<String> itr=s.iterator();
        	 while(itr.hasNext())
        	 {
        		 System.out.println(itr.next());
        	 }
         System.out.println("element o top :" +s.peek());
         System.out.println("search rod :"+s.search("john"));
         
         
         
	}

}
