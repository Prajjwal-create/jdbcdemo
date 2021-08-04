package oppsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Circle(10);
		
		System.out.println("Using Interface:"+shape.LABLE);
		
		shape.draw();
		System.out.println("Area of circle with radius is:"+shape.get shape.getArea());
		
		shape=new Rectangle(10,7);
		
		shape.draw();
		System.out.println("area of rectangle is:" +shape.getArea());
		
		

	}

}
