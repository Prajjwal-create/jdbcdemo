package oppsdemo1;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book();
		
		b1.setBookId(101);
		b1.setBookname("Programming c");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		System.out.println("************Book Details********");
		System.out.println(b1.getBookId()+ " "+b1.getBookname()+" " +b1.getPrice()+" "+b1.getPublisher() );
		
		System.out.println(b1);

	}

}
