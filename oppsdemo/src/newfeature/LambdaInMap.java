package newfeature;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LambdaInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> books = new HashMap<>();
		books.put("Let Us c","Yashwant kenetkar");
		books.put("Object oriented Programing using java", "Simon kendal");
		books.put("java :,Graphicaluser  interface","David Etheridge");
		
		books.forEach((key,value)-> System.out.println("Book name :"+key +"Author :"+value));
		System.out.println("---------Normal wayy to traverse a map------");
		for(Entry<String,String> e:books.entrySet()) //for in oloop
		{
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		

	}

}
