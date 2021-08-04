package collectiondemo;
// comparable intreface 
public class Student implements Comparable<Student>
{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age>o.age) //elze if(age<o,age)//decending order
			 return 1;
		
		else return -1;
	}
	
	
	
}


