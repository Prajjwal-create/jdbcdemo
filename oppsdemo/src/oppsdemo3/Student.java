package oppsdemo3;

public class Student {
	
	private int rollNo;
	private String name;
	private static String college="SRM";
	
	static void collegechange()
	{
		college="RVC";
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
   void display()
   {
	   System.out.println(rollNo+" "+name+" "+college);
   }
   int ret()
   {
	   return rollNo;
   }
}
