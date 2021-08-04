package miscellaneous;

import java.util.Scanner;

public class TwoPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,Integer> p1=new Pair<String,Integer>("The car Guy",8);
		
		Scanner s= new Scanner(System.in);
		System.out.println("our current rating for "+p1.getFirst()+" is:" +p1.getSecond()     );
		System.out.println("how would you rate them?");
		int score = s.nextInt();
		
		p1.setSecond(score);
		System.out.println("our new rating fro" +p1.getFirst()+ "is:" +p1.getSecond());

		
Pair<String,Float> p2=new Pair<String,Float>("The car Guy",8.5f);
		
		//Scanner s= new Scanner(System.in);
		System.out.println("our current rating for "+p2.getFirst()+" is:" +p1.getSecond()     );
		System.out.println("how would you rate them?");
		float score1 = s.nextFloat();
		
		p2.setSecond(score1);
		System.out.println("our new rating fro" +p2.getFirst()+ "is:" +p2.getSecond());

	}

}
