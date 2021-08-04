package newfeature;
@FunctionalInterface

interface MyFunctionInterface

{
	public String sayHello();
}

interface MyFunctionalInterface1
{
	  public int incrementbyFive(int a);
	  
}
interface StringConcat
{
	public String sconcat(String a, String b);
}
public class LambdaExpressionDemo {
         // lamda expression with no parameter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctionInterface msg=()-> { return "HelloFrom lamda exp ";};
		System.out.println(msg.sayHello());
		
		//lambda expression with single parameter
		MyFunctionalInterface1 f=(num) ->num+5;
		System.out.println(f.incrementbyFive(20));
		
		//lambda exression with multiple arguments
		StringConcat s=(str1,str2) -> str1,str2;
		System.out.println("string concate using lambda expression");
		System.out.println(s.sconcat("Hello","Java8"));
		

	}

}
