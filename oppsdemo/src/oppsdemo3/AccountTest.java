package oppsdemo3;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SavingAccount sAccountObj = new SavingAccount("John", 500, 4);
	        System.out.println("\nSavings Account Details");
	        System.out.println("------------------------");
	        System.out.println("" + sAccountObj.getName()
	        + " has an initial Balance of: " + sAccountObj.getBalance());
	        sAccountObj.deposit(200);
	        sAccountObj.withdraw(200);
	        System.out.println("" + sAccountObj.getName()
	        + " at the end of transaction has a Balance of: "
	        + sAccountObj.getBalance());

	        System.out.println("\nChecking Account Details");
	        System.out.println("------------------------");

	        CheckingAccount cAccountObj = new CheckingAccount("Stephen", 200, 200);
	        System.out.println("" + cAccountObj.getName()
	        + " has an initial Balance of: " + cAccountObj.getBalance());
	        cAccountObj.deposit(200);
	        cAccountObj.withdraw(500);
	        System.out.println("" + cAccountObj.getName()
	        + " at the end of transaction has a Balance of: "
	        + cAccountObj.getBalance());

	}

}
