package Summative;
/**
 * exitButton.java
 * @author Jack Durette
 * 15/05/2017
 * this is the exit button behavior
 */



import	lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class exitButton implements Behavior {
	
	private boolean supressed = false;
	
	public boolean takeControl() { 
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}
	public void action(){
		System.exit(0);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}
	


}


