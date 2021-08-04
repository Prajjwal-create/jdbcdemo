package oppsdemo1;

public class Book {

	
	int bookId;
	String bookname;
	float price;
	String publisher;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookname=" + bookname + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}
	
	
	
}


