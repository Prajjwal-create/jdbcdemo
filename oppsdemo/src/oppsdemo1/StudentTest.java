package oppsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of student class
		Student s1=new Student();
		Student s2=new Student();
		
		//invoke method of student class using dot operator
		s1.input();
		float tot=s1.calculate();
		s1.display();
		
		System.out.println("total dispalyed from main:"+tot);
		
		s2.input();
		float tot1=s2.calculate();
		s2.display();
		
		System.out.println("total dispalyed from main:"+tot1);
		
		
	}

}
