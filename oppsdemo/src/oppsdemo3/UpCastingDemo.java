package oppsdemo3;
//Upcasting is used when you want to generalise a function or
//property so that it can be used by any of it’s subtype.
class Game
{
	public void play(){

		System.out.println("Game is being played");

		}

		 

		public void noOfPlayers(){

		System.out.println("No of players depend upon the game");

		}

		 

		public void winner(String name){

		System.out.println("Winner is : " + name);

		}
}

	 class Cricket extends Game{

		 

		public void noOfPlayers(){

		System.out.println("22");

		}

		 

		public void teams(){

		System.out.println("2");

		}

		}

	
 class Chess extends Game{

	public void noOfPlayers(){

System.out.println("2");

}

}
public class UpCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Cricket(); //upcasting -- call overridden and base class method
		Game g1= new Chess();
		g.play();
		g.noOfPlayers();
		g.winner("A");
		
		
		Cricket c=new Cricket();
		c.teams();
		g1.play();
		g1.noOfPlayers();
		g1.winner("vish");
          
	}

}
