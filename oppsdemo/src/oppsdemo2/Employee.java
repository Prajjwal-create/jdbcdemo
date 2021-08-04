package oppsdemo2;

public class Employee { //parrent class

	
	int empId;
	String name;
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("*********Employee Details ************");
		System.out.println("Employee Id :" +empId);
		System.out.println("Employee Nmame: "+name);
		
		
	}
	
}
