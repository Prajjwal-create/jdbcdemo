package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Developer>a1 = new ArrayList<Developer>();

		 Student s1=new Student(103,"Mike","java");
		 Student s2=new Student(105,"mary","dotnet");
		 Student s3=new Student(101,"ravie","angular");
		 Student s4=new Student(102,"hary","php");
		 Student s5=new Student(104,"navie","oracal");
		 
		 a1.add(s1);a1.add(s2);a1.add(s3);a1.add(s4);a1.add(s5);
		 System.out.println("******* Sort By Id********");
		 for(Developer i:a1) {
		 System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		 }
		 
		 Collections.sort(a1,new DomainComparator());
		 System.out.println("----------Sort by domain--------");
		 for(Developer i:a1)
		 {
			 System.out.println(i.getId()+" "+i.getName()+" "+getDomain());S
		 }
	}

}
