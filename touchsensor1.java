package Summative;
import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;

/**
 * touchsensor1.java
 * @author Jack Durette
 * 15/05/2017
 * this is the first touch sensor behavior
 */


public class touchsensor1 implements Behavior {
TouchSensor contact1 = new TouchSensor(SensorPort.S2); //makes a variable for a touch sensor
UltrasonicSensor Sonic = new UltrasonicSensor(SensorPort.S1);


public boolean takeControl() {   //takes control when a touch sensor is pressed
	if(contact1.isPressed()){
		return true;
	}
	return false;
}
public void action(){
	Sound.setVolume(1000); // defines the volume of the robot
	int distance = Sonic.getDistance(); //reads the distance between the slider and the sensor
	int pitch  = 0;
	if (distance <= 3){ //assigns a variable to set distances
		pitch = 1;
	}else if(distance <= 6){
		pitch = 2;
	}else if(distance <= 9){
		pitch = 3;
	}else if(distance <= 12){
		pitch = 4;
	}else{
		pitch = 5;
	}
	if (pitch == 1){
		while (contact1.isPressed()){
		Sound.playNote(Sound.XYLOPHONE, 131, 400); //produces a pitch based on the distance using a xylophone scale 
		}
	}else if(pitch == 2){
		while (contact1.isPressed()){
		Sound.playNote(Sound.XYLOPHONE, 147, 400);
		}
	}else if(pitch == 3){
		while (contact1.isPressed()){
		Sound.playNote(Sound.XYLOPHONE, 165, 400);
		}
	}else if(pitch == 4){
		while (contact1.isPressed()){
		Sound.playNote(Sound.XYLOPHONE, 175, 400);
		}
	}else{
		while (contact1.isPressed()){
		Sound.playNote(Sound.XYLOPHONE, 196, 400);
		}
	}
}
public void suppress(){ //no suppressions
	
}


}
