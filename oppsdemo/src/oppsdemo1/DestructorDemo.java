package oppsdemo1;

class Test{
	
	public void finalize() //override finalize method of object class
	{
		System.out.println("Object Destroyed and Garbage collector");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test(); // initialaze object -- call default cosntructor
		Test t2=new Test();
		
		t1=null;   // de allocate memory
		t2=null;
		
	  System.gc(); // invoke service methid gc()-- invole finalzed()
	  System.out.println("In main method");
	  
	  
	}

}
