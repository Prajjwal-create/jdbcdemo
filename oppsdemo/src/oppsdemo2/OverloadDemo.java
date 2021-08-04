package oppsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Addition a1=new Addition();
         // invoking add overload method
         a1.add();
         a1.add(20,30);
         a1.add(34.75f,542.67f);
         a1.add(300,500,100);
         a1.add("HEllo","world");
	}

}
