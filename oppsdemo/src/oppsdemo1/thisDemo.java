package oppsdemo1;

public class thisDemo {
	 int age;
    thisDemo(int age)
    {
    	//age=age;
    	this.age=age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
     
        
        thisDemo td1=new thisDemo(22);
        System.out.println("The  value of age is: "+td1.age);
	}

}
