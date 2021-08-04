package oppsdemo2;
   // String task,tech;
public class Accountant extends Employee {
	 String task,tech;
	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);  //invoke base class constructor
		// TODO Auto-generated constructor stub
		
		
		this.task=t1;
		this.tech=t2;}
	
	
	void display() {
	super.display();  //display base class constuctr
	    System.out.println("Accoutant tack:"+task);
	System.out.println("Software used:"+tech);

}
}