package oppsdemo3;
class Count
{
	static int cnt;  //static varialbe
	int a;  //inrtance varialbe
	
	Count() //constructor
	{
		cnt+=1;
	}
	static void display()  //static methd
	{
		System.out.println("No of object created:"+cnt);
	}
	void print()  //inatance method
	{
		System.out.println("Instance enthod");
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();c2.print();c3.print();
		//c1.display();
		Count.display(); //invoke statics method
	}

}
