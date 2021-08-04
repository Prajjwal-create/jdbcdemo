package defaultt;

interface hello
{
	void welcome();
}

public class MethodrefrenceDemo {
	
	public static void display()
	{
		System.out.println("Hello from method reference");
	}
	public void print()
	{
		System.out.println("instsnt metode call using methd refrence");
	}
	MethodrefrenceDemo()
	{
		System.out.println("In constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello h=MethodrefrenceDemo::display; //invoke statics metood
		h.welcome();
		MethodrefrenceDemo d1=new MethodrefrenceDemo();
		hello h1=d1::print; // invoking instante method
		h1.welcome();
		
		hello h2=MethodrefrenceDemo::new; // method refrence to constructo
		h2.welcome();
		
	}

}
