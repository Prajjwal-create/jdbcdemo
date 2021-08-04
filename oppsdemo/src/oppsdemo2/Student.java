package oppsdemo2;

public class Student {
  int rollNo;
  String name;
  
  Address ad;

public Student(int rollNo, String name, Address ad) { //generate cosntruction through fied
	this.rollNo = rollNo;
	this.name = name;
	this.ad = ad;
}
  void display()
  {
	  System.out.println("----------Student details------");
	  System.out.println("Student Id" +rollNo);
	  System.out.println("Student Name :"+name);
	  System.out.println("Adress:"+ad.city+ " "+ad.state+" "+ad.country+" "+ad.pincode);
  }
  
}
