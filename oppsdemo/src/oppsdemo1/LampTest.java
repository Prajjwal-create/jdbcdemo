package oppsdemo1;
class Lamp
{
	// stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;
	  
	  //mwthod to turn on the light
	   void turnOn()
	   {
		   isOn=true;
		   System.out.println("Light on?"+isOn);
	   }
	   
	   //method to trn offt the light
	   void turnOff()
	   {
		   isOn=false;
		   System.out.println("light on?"+isOn);
	   }

}
public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object led and halogen
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		//switch on led & halogen
		led.turnOn();
		halogen.turnOn();
		
		//switch off led and halogen
		led.turnOff();
		halogen.turnOff();
		

	}

}
