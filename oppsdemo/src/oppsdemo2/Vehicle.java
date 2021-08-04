package oppsdemo2;
//method overriding
public class Vehicle {
	
	void drive()
	{
		System.out.println("Driving vehicle");
	}

}
class Car1 extends Vehicle
{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving car");
	}
	
}
class Truck extends Vehicle
{

	@Override
	void drive() {
		System.out.println("Driving truck");
	}
	
	void load()
	{
		System.out.println("loading the truck");
	}
	
}