package oppsdemo3;

public class Director extends Employee {

	 double transportAllowance;
	public Director(String name, double basic, String address,double ta) {
		super(name, basic, address);
		// TODO Auto-generated constructor stub
		this.transportAllowance=ta;
	}
void show() {
	super.show();
	System.out.println("transport allownace: \t"+ transportAllowance);
	}
@Override
double totalPay() {
	// TODO Auto-generated method stub

    double totalAmount = 0;
             double houseRentAllowance = (basic * 0.08);
             double dearnessAllowance = (basic * 0.3);
             double medicalAllowance = 1500;
             totalAmount = basic + houseRentAllowance
             + dearnessAllowance + medicalAllowance;
         return totalAmount;

	
}
       
	}
