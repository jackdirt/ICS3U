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
 * this is the second touch sensor behavior
 */

public class touchSensor2 implements Behavior {
TouchSensor contact2 = new TouchSensor(SensorPort.S3);
UltrasonicSensor Sonic = new UltrasonicSensor(SensorPort.S1);


public boolean takeControl() { 
	if(contact2.isPressed()){
		return true;
	}
	return false;
}
public void action(){
	Sound.setVolume(1000);
	int distance = Sonic.getDistance();
	int pitch  = 0;
	if (distance <= 3){
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
		while (contact2.isPressed()){
		Sound.playNote(Sound.PIANO, 131, 400);
		}
	}else if(pitch == 2){
		while (contact2.isPressed()){
		Sound.playNote(Sound.PIANO, 147, 400);
		}
	}else if(pitch == 3){
		while (contact2.isPressed()){
		Sound.playNote(Sound.PIANO, 165, 400);
		}
	}else if(pitch == 4){
		while (contact2.isPressed()){
		Sound.playNote(Sound.PIANO, 175, 400);
		}
	}else{
		while (contact2.isPressed()){
		Sound.playNote(Sound.PIANO, 196, 400);
		}
	}
}
public void suppress(){
	
}


}