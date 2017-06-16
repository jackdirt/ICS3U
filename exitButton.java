package Summative;
/**
 * exitButton.java
 * @author Jack Durette
 * 15/05/2017
 * this is the exit button behavior
 */



import	lejos.nxt.Button; //importing all needed code
import lejos.robotics.subsumption.Behavior;

public class exitButton implements Behavior { 
	
	private boolean supressed = false; //suppression
	
	public boolean takeControl() {  //what causes the code to activate
		if(Button.ESCAPE.isDown()){ //this happens when the button is pressed
			return true;
		}
		return false;
	}
	public void action(){
		System.exit(0); //what happens when this code takes control (ends program)
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}
	


}


