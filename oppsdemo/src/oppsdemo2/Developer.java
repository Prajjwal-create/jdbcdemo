package oppsdemo2;

public class Developer extends Employee { ///child class of employee

	
	String technology;
	public Developer(int empId, String name,String tech) {
		super(empId, name);
		// TODO Auto-generated constructor stub
		
		this.technology=tech;
	}
	
	void display1()
	{
		//super.display(); 
		System.out.println("Technologu" +technology);
	}

}
