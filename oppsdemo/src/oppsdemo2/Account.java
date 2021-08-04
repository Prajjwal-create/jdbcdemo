package oppsdemo2;
//Multilevel i heritance
public class Account {   //base class for saving accont

	int accNo;
	String name;
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("************ Account details*********");
		System.out.println("Account Number :" +accNo);
		System.out.println("customer name :"+name);
		
		
		
	}
	
}
