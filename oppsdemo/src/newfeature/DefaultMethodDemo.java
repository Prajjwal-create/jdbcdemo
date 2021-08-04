package newfeature;

 interface MyInterface
 {
	 public void square(int a); //abstract emthod
 
	 // default method
	 default void  display(String a)
	 {
		 System.out.println("hello" +a);
	 }
	 //statics method
//	       static void print()
//	      {
//		 System.out.println("today date :" +LocalDate.now());	
//		 }

	 static void printDate() {
		// TODO Auto-generated method stub
		
	}
 }
public class DefaultMethodDemo implements MyInterface
{
	

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("the square of a numer is:"+(a*a));
		
		
	}
	public static void main(String[] args)
	{
		DefaultMethodDemo d1=new DefaultMethodDemo();
		d1.square(5);
		
		//call ddefault method in interfce
		d1.display("default method");
		
		//call statics metohd in interface
		MyInterface.printDate();

	}

	

}
