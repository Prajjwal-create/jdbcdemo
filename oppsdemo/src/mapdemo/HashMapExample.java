package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Double> hm= new HashMap<String,Double>();
		
		hm.put("Jphn", 5000.50);
		hm.put("jim", 4300.50);
		hm.put("daisy", 500.50);
		hm.put("jkc", 832.50);
		hm.put("joker", 700.50);
		
		System.out.println("dispaly customer:");
		for(String k:hm.keySet())
		{
			System.out.println(k+"--->"+hm.get(k));
		}
		//deposite 1000 to jim account
		double bal=hm.get("jim");
		hm.put("jim",bal+1000);
		System.out.println("jim new balace id:"+hm.get("jim"));
			
				hm.putIfAbsent("Raj",500.00);
				System.out.println(hm);
				//.out.println(hm);
				Scanner s=new Scanner(System.in);
			       System.out.println("Enter Customer Name for his Balance :");
			       String name=s.next();
			       System.out.println("The Balance of "+name+ " is :"+hm.get(name));
		
	}

}
