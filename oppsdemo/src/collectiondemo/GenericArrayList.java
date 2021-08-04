package collectiondemo;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strLst=new ArrayList<String>();
		strLst.add("alpha");
		strLst.add("beta");
		
		System.out.println(strLst);
		for(int i=0;i<strLst.size();i++)
		{
			String str=strLst.get(i);
			System.out.println(str);
		}
		strLst.add("gama");
		System.out.println(strLst);
		System.out.println(strLst.get(2));
		
		
		
		

	}

}
