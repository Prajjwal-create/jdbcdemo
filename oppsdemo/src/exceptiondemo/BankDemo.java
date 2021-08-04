package exceptiondemo;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccout c1= new CheckingAccout(10000);
		System.out.println("Depositing 5000........");
		c1.deposit(5000);
		
		try
		{
			System.out.println("withDrawing 1000");
		}
		
		catch(InsufficientFund e)
		{
			System.out.println("sorry insufficient balance :" +c1.getBalance());
			e.printStackTrace();
		}

	}

}
