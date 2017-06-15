package Summative;

import lejos.robotics.subsumption.Behavior;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;


public class ultraSOUND implements Behavior{
	private boolean supressed = false;
	UltrasonicSensor Sonic = new UltrasonicSensor(SensorPort.S3);
	


	public boolean takeControl(){
		return true;
	}
	public void action(){
		int distance = Sonic.getDistance();
		
		if (distance <= 3){
			int pitch = 1;
		}else if(distance <= 6){
			int pitch = 2;
		}else if(distance <= 9){
			int pitch = 3;
		}else if(distance <= 12){
			int pitch = 4;
		}else{
			int pitch = 5;
		}
	}
	public void suppress(){
		
	}
}
