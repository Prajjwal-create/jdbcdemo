package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        //add element to hashmap
        hmap.put(12,"ravi");
        hmap.put(12,"monika");
        hmap.put(12,"ross");
        hmap.put(12,"chandeler");
        hmap.put(12,"joye");
     // Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap
        Set s1=hmap.keySet();
        System.out.println(s);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }
       
        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
        //get value based on key
        String name=hmap.get(49);
        System.out.println("THE name with key is :"+name);
     //   hmap.remove
 
}
