package newfeature;
interface MathOperation {
    int operation(int a, int b);
 }
   
 interface GreetingService {
    void sayMessage(String message);
 }

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("Addition :"+addition.operation(20, 30));
        

 

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("sub :"+subtraction.operation(50,20));

 

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };
System.out.println("multiplcation "+multiplication.operation(5, 10));
 

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("division:"+division.operation(20, 5));
        
      //without parenthesis
        GreetingService greetService1 = message ->
        System.out.println("Hello " + message);
         
        //with parenthesis
        GreetingService greetService2 = (message) ->
        System.out.println("Hello " + message);
         
        greetService1.sayMessage("Mike");
        greetService2.sayMessage("John");
		

	}

}
