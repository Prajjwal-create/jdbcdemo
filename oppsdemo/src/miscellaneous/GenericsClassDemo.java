package miscellaneous;


class Sample<T> //parametrized class//generic class
{
	  private T data;  //generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	  
	
	
}
public class GenericsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample<String> s1=new Sample<String>("java Generics");
		System.out.println("Display from generic class by passig string Object:"+s1.getData());

		Sample<Integer> s2=new Sample<Integer>(200);
		System.out.println("Display from Generics class by passing integer Object" +s2.getData());
		Sample<Double> s3=new Sample<Double>(555.50);
		System.out.println("Display from Generics class by passing double Object" +s2.getData());
	}

}
