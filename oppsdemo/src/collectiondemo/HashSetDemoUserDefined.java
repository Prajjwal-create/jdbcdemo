package collectiondemo;
/*
HashSet will use the `equals()` & `hashCode()` implementations 
of the Customer class to check for duplicates and ignore them
*/

import java.util.HashSet;
import java.util.Set;

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> customers = new HashSet<Customer>();
		//add new custmer object tp set
		customers.add(new Customer(101,"Arun","Banglore"));
		customers.add(new Customer(101,"racheoul","tokyo"));
		customers.add(new Customer(101,"ross","denver"));
		customers.add(new Customer(101,"monika","den"));
		customers.add(new Customer(101,"geller","newyork"));
		//add dplicate
		customers.add(new Customer(101,"Arun","Banglore"));
		
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
	}
    
}
