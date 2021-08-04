package oppsdemo3;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.collegechange();
		
		Student s1=new Student(101,"Mike");
		Student s2=new Student(102,"John");
		Student s3=new Student(103,"mary");
		
		s1.display();
		s2.display();
		s3.display();
       int ans = s1.ret();
            System.out.println(ans);
	}

}
