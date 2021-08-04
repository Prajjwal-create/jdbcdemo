package oppsdemo1;

import java.util.Scanner;

//instance class
public class Student {
   //properties
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner s=new Scanner(System.in);
	
	//methods
	
	void input()
	{
		System.out.println("Enter Roll No,NAme,course");
		rollNumber= s.nextInt();
		name=s.next();
		course= s.next();
		System.out.println("Enter marks of 3 sub");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3=s.nextFloat();
	}
	float calculate()
	{
		total=m1+m2+m3;
		return total;
	}
	void display()
	{
		System.out.println("******student detail*****");
		System.out.println("Roll no"+rollNumber);
		System.out.println("name   :"+name);
		System.out.println("Course   :"+course);
		System.out.println("total marks   :"+total);
		System.out.println("*************************")
				;
	}
	
}
