package oppsdemo1;

import java.util.Scanner;

public class employee {
	
	String name,address;
	int yoj;
	Scanner s=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter name, year of joining, address");
		name =s.next();
		yoj= s.nextInt();
		address =s.next();
		
	}
	void display()
	{
		
		  System.out.println(name+ "\t   " +yoj+ "\t          " +address); 
				;
	}
	

}
