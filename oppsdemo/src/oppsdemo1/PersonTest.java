package oppsdemo1;

import java.util.Scanner;

//program to demostate working of constructor
class Person
{
	String name , constituency ;
	int age;
	Scanner s;
	public Person() {  //default or implicit cosntuctor
		// TODO Auto-generated constructor stub
		
		System.out.println("Voter Eligibilty app");
		age=0;
		name="";
		constituency="Bangluru";
		s= new Scanner(System.in);
		
	}
	public Person(String name, int age) { //parametarised cosntructor
		this.name = name;
		this.age = age;
		constituency="mumbai";
	}
	Person(String n,int a,String c) //parametrisedconstructor 2 arg
	{
		name=n;
		age=a;
		constituency=c;
	}
	void input()
	{
		System.out.println("enter name");
		name=s.nextLine();
		System.out.println("entre your age");
		age=s.nextInt();
	}
	
	void print()
	{
		System.out.println("Name is :"+name);
		System.out.println("age is: "+age);
		System.out.println("Constituency is:" +constituency);
		
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person objPerson =new Person();//invoke inplicit cosntructor
		objPerson.input();
		objPerson.print();
		System.out.println("-----------------");
		Person objPerson2=new Person("Mike",45);
		objPerson2.print();
		System.out.println("---------------------------------------");
		Person objPerson3=new Person("Ravi",60,"Delhi"); //invoke costructor with 3 srgument
		objPerson.print();
		
		

	}

}
