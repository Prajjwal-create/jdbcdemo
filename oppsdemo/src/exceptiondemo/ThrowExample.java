package exceptiondemo;

public class ThrowExample {
         public static void checkEligibility(int age,int weight)
         {
        	 if(age<12 && weight <40)
        	 {
        		 throw new ArithmeticException(" Student in Not Eligible for registration");
        	 }
        	 else
        	 {
        		 System.out.println("Student with age :"+age+" and"+weight+" is Eligible");
        		 
        	 }
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome t sport eligibility process..");
		checkEligibility(20,45);
		System.out.println("thankyou");
		checkEligibility(10,39);

	}

}
