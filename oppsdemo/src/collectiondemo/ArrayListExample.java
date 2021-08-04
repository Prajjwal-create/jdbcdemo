package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create list of book;
		List<Book> bList=new ArrayList<Book>();
		
		//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
            // add book to list
        bList.add(b1);
        bList.add(b1);
        bList.add(b3);
        
        System.out.println(bList);
        System.out.println();
         //traverse a list
        System.out.println("************ Book Detail*********");
        for(Book i:bList)
        {
        	System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        	
        }
        System.out.println("Total no. of book:" +bList.size());
        
	}

}
