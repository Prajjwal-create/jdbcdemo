package oppsdemo3;

import java.util.Scanner;

public class Calculate implements IMath {
    Scanner kb;
	@Override
	public void add() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sun() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform sub");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("sub of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform mul");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("mul of "+a+" and "+b+" is "+s);


		

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform div");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("div of "+a+" and "+b+" is "+s);



	}
	public static void main(String[] args) {
		Calculate c1= new Calculate();
		c1.display();
		c1.add();
		c1.sun();
		c1.mul();
	}

}
