package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
   //non generic array list
	
	ArrayList playerArray;
	List subList;
	
		public PlayerList()
		{
			playerArray=new ArrayList();
			subList=new ArrayList();
		}
		
		void addPlayer()
		{
			for(int i=1;i<=5;i++)
			{
				playerArray.add(i); //autoboxing
			}
			
			playerArray.add("martina");
					playerArray.add("serena");
							playerArray.add("martina");
		}
		void search() {
	        System.out.println();
	        System.out.println("************************************"
	        + "***********************");
	        System.out.println("Search for an object and return "
	        + "the first and last position");
	        System.out.println("*********************************"
	        + "***************************");
	        System.out.println();
	        System.out.println("First occurance of the String"
	        + " \"Serena\" is at position " + playerArray.indexOf("Serena"));
	        System.out.println("Last occurance of the String"
	        + " \"Serena\" is at position  " + playerArray.lastIndexOf("Serena"));
	        System.out.println();
	    }
		void extract() {
	        System.out.println("***************************"
	        + "*********************");
	        System.out.println("Extract a sublist and "
	        + "then print the new List ");
	        System.out.println("************************"
	        + "*************************");
	        System.out.println();
	        subList = playerArray.subList(5, playerArray.size());
	        System.out.println("New Sub-List from index 5 to "
	        + playerArray.size() + " is : " + subList);
	        System.out.println();
	    }
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerList p1=new PlayerList();
		
       p1.addPlayer();
       p1.search();
       p1.extract();
       }


}