package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		ArrayList<String>a1=new ArrayList<String>();
		
		//add element to arraylist
		a1.add("java");
		a1.add("perl");
		a1.add("c++");
		a1.add("c# 5.0");
		System.out.println((a1));
		System.out.println("element at index 1" +a1.get(1));
		System.out.println("Does list contain java ");
		
		for(String i: a1)
			System.out.println(i);
		
		System.out.println();
		//add element at a specific index
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("IS Arraylist empty ?"+a1.isEmpty());
		System.out.println("Index of perl :"+a1.indexOf("Perl"));
		System.out.println("size of Arrayalist:"+a1.size());
		
		Collections.sort(a1); //for sorting
		System.out.println("array list after osrting:"+a1);
		//a1.add(100) //complier error
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(200);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		System.out.println(a2);
		System.out.println("size:" +a2.size());
		
		
		

	}

}
