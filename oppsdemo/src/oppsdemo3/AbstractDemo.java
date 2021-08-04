package oppsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Trainee t1=new Marks("John","New York", 1001,35);
         
         t1.show();
        double marks =t1.claculateMark();
         System.out.println(t1);
	}

}
