package oppsdemo2;

public class SavingBank extends Account {
    private int min_bal; // can access only within the class
       private int balance; // can sccess within & in the sub classes
	public SavingBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;  
		this.balance=b;
		
	}
	
    
	void display()
	{
		super.display();
		System.out.println ("Minimum Balance: "+min_bal);
		 System.out.println ("Saving Balance: "+balance);
	}
	
//	             {​​​​​​​​
//	               // super.display(); // invoke account
//	               // System.out.println ("Minimum Balance: "+min_bal);
//	                System.out.println ("Saving Balance: "+balance);
//	             }​​​​​​​​
}


