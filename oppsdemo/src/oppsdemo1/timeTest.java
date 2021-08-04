package oppsdemo1;

public class timeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t1=new Time(3,55,45);
		Time t2=new Time(5,10,20);
		t1.add(t2);
		
		System.out.println("The addition of 2 timed is");
		t1.display();
	}

}
