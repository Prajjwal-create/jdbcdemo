package oppsdemo1;

import java.util.Scanner;

public class echoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		
		Scanner s=new Scanner(System.in);
		boolean a=true;
		
		 while(a== true)
		 {
			 System.out.println("enter char");
			 c = s.next().charAt(0);   
			 if (c=='#' ) {
				 System.out.println("terminate");
				 a=false;
				 break;
			 }
			 
			 System.out.println(c);
				 
		 }
		// System.out.println(c);
	}

}
