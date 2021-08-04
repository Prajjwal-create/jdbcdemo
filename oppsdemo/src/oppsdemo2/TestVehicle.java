package oppsdemo2;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vobj = new Vehicle();
				vobj.drive();
		
		Vehicle vCar= new Car1(); //upcasting
		vCar.drive(); //invoke overriden drive ethod of car1 class
		
		Vehicle vTruck=new Truck();
		vTruck.drive();
		//vTruck.load();// compiler error not overdiden
		
		Truck t1=new Truck();
		t1.load();

	}

}
