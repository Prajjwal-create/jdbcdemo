package newfeature;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> lp1=new ArrayList<Product>();
		
		lp1.add(new Product(101,"Apple Laptop",35000f));
		lp1.add(new Product(101,"lenova",55000f));
		lp1.add(new Product(101,"Hp laptop",25000f));
		lp1.add(new Product(101,"Delllaptop",85000f));
		lp1.add(new Product(101,"Sony Laptop",65000f));
		
		
		System.out.println("lptop price greater that 30000");
		lp1.stream() 
		            .filter(p->p.price >30000)
		            .forEach(p-> System.out.println(p.name));
		
		//iterate in arraylist
	     System.out.println("*******DIaplay all record****");
		lp1.stream()
		     .forEach(p-> System.out.println(p.id+" "+p.name+" "+p.price));
		

	}

}
