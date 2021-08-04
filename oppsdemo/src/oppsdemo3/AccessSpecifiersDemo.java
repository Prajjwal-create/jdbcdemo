package oppsdemo3;

class Test
{
	int a;  //default variable
	private int b; //private variable
	protected int c; // accessed in subclass
	public Test(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void display() //public method
	{
		System.out.println("private variable"+b);
	}
}
class Test2 extends Test
{
	public Test2(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	public void display()  //public method
	{
		System.out.println("protected variable"+c);
	}


}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(100,200,300);
		t1.display();
		//t1.b=50; compiler erroe cant access private varialbe;
		System.out.println("default variable"+t1.a);

	}

}
