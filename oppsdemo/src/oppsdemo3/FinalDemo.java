package oppsdemo3;

class Hello
{
	final void display()
	{
		System.out.println("thsi is a final method");
	}
}
class world extends Hello  //final classes cannot be exended
{
	//final methd cannot be overridden
	/*final void display()     
	{
		System.out.println("this is a final method");
	}*/
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int final AGE=20;
//       final float PI=3.142f
//       
     //  AGE=30: -- compilation error - final variable canto be change
	}

}
