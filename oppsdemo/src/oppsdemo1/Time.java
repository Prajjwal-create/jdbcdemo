package oppsdemo1;
/* JVA PROGRAM to perform addition of 2 time
 * t1----> 12:24:55
 * t2---> 10 :30 :30
 * 
 * t1+t2
 * if sec>60  .. mins should be inclreameted  and sec -60,,
 * if  min>=60 .....hrs should be incleament and min 60
 */
public class Time {

	int hrs,min,sec;
	
  Time()
  {
	  hrs=min=sec=0;
  }
  Time(int h,int m,int s)
  {
	  hrs=h;
	  min=m;
	  sec=s;
  }
  void add(Time t)
  {
	  this.hrs= t.hrs;
	  this.min=t.min;
	  this.sec=t.sec;
		
	  if(this.sec>=60)
	  {
		  this.sec= this.sec;
		  this.min=this.min+1;
		 
	  }
	  if(this.min>=60) {
		  this.min=60-this.min;
		   this.hrs=this.hrs+1;
	  }
	  
  }
  void display()
  {
  	System.out.println(this.hrs+" : "+this.min +":" +this.sec);
  	
  }
	
}
