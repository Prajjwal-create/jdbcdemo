package oppsdemo2; //
// Java program to implient hierarchical inheritance
 class Doctor
 {
	 int idNumber;
	 String name;
	 String address;
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	 
	void display() {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idNumber);
	        System.out.println("The address is :" + address);
	    }
 }
  class Specialist extends Doctor
  {
	  String speciality;
	  public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address); //take the value from the base class to reduce code
		
		this.speciality=sp; //this is not in the base class
		
	}

	  void display() {
		    super.display(); // call base class method
		    System.out.println("The speciality is :" + speciality); //rest which is not in base class
		    }
  }
   class NonSpecialist extends Doctor
   {

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
		// TODO Auto-generated constructor stub
	}
	   
   }
public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //invoke child class specialist constructor
        Specialist spobj= new Specialist(1001,"MArry","New york","cardiology");
        spobj.display();
        //invoke child class nonspecialist constructor
        NonSpecialist nsobj =new NonSpecialist(1005,"John","sydney");
        nsobj.display();
	}

}
