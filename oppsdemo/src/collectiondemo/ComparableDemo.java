package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Student> a1=new ArrayList<Student>();
          Student s1=new Student(101,"Mike",19);
          Student s2=new Student(102,"Mike",15);
          Student s3=new Student(103,"Mike",10);
          Student s4=new Student(103,"Mike",10);
          Student s5=new Student(103,"Mike",10);
          
          //adding student
          a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);a1.add(s5);
          Collections.sort(a1);
          
          System.out.println("8********** student srted list based on age**********");
          for(Student s:a1)
          {
        	  System.out.println(s.rollNo+" "+s.name+" "+s.age);
          }
	}

}
