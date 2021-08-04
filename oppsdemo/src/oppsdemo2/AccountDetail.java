package oppsdemo2;
/* multi level inheritance
 * account ----->  savingbank-----> accountdetails -- miltilevel
 */
public class AccountDetail extends SavingBank {
   int withdrawl,deposit,finalbalance;
   
	public AccountDetail(int accNo, String name, int mb, int b,int w,int dep) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=dep;
		//this.deposit=dep;
//		void display()
//	    {
//	             super.display();
//	            System.out.println ("Deposit: "+deposit);
//	            System.out.println ("Withdrawals: "+withdrawl);
//	            finalbalance=(balance+deposit)-withdrawl;
//	            System.out.println("Final Balace:"+ finalBalance);
//	    }
		
	    ​​​​​​​

	}

}
