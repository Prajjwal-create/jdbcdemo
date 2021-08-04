package oppsdemo1;

public class ConstructorDemo {

	int id;
	String name;
	float salary;
	ConstructorDemo() //implcit constructor
	{
		System.out.println("I AM A DEFAULT CONSTRUCTOR");
		id=0;
		name="";
		salary=5000.00f;
	}
   
	void display()
	{
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd1=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
   cd1.display();
	}

}
/*int a; //varialbel decaltion
int a=10; //varialble decalrationand initilisation*/