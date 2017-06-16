package Summative;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
 * touchsensor1.java
 * @author Jack Durette
 * 15/05/2017
 * this is the behavior operator
 */

public class guitarBot {

	
	Behavior b1  = new exitButton();	 //the different behaviors
	Behavior b2  = (Behavior) new touchsensor1();	
	Behavior b3  = (Behavior) new touchSensor2();	

	
	Behavior[] behaviors = {b3,b2,b1}; //order that which the behaviors will take place
	
	Arbitrator archonOfJustice = new Arbitrator (behaviors); //defines arbitrator
	archonOfJustice.start(); //starts arbitrator
	
	
	
	
	
}
