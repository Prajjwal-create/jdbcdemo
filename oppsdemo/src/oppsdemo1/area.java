package oppsdemo1;

import java.util.Scanner;

     class areaclass {
	int len,bred;
	  void areat(int a, int b )
	{
		len=a;
		bred=b;
	}
	
       int totalarea()
	{
		//System.out.println(len*bred);
		return len*bred;
	}

}
public class area {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		 // s.nextLine();
		  System.out.println("Enter the lenght of Recatangle");
		a= s.nextInt();
		  System.out.println("Enter the breadth of Recatangle");
		b= s.nextInt();
		
		areaclass ans = new areaclass();
		ans.areat(a,b);
		int x=ans.totalarea();
		 System.out.println("the area is" +x);
		
		
		
	}
		
}
	