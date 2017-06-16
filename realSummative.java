package Summative;
import lejos.nxt.Sound;
import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

/**
 * touchsensor1.java
 * @author Jack Durette
 * 15/05/2017
 * this is my program, which works flawlessly, but does not utilize behaviors
 */
public class realSummative {
	public static void main(String[] args) {
		int pitch  = 0;
		TouchSensor contact1 = new TouchSensor(SensorPort.S2);
		TouchSensor contact2 = new TouchSensor(SensorPort.S3);
		TouchSensor contact3 = new TouchSensor(SensorPort.S4);
		UltrasonicSensor Sonic = new UltrasonicSensor(SensorPort.S1);
		Sound.setVolume(5000);

		while(10 > 0){

			while(contact2.isPressed()){
				int distance = Sonic.getDistance();

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

					Sound.playNote(Sound.PIANO, 294, 400);

				}else if(pitch == 2){

					Sound.playNote(Sound.PIANO, 330, 400);

				}else if(pitch == 3){

					Sound.playNote(Sound.PIANO, 350, 400);

				}else if(pitch == 4){

					Sound.playNote(Sound.PIANO, 392, 400);

				}else{
					Sound.playNote(Sound.PIANO, 440, 400);

				}
			}
			while(contact1.isPressed()){
				int distance = Sonic.getDistance();

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
					Sound.playNote(Sound.XYLOPHONE, 147, 200);
				}else if(pitch == 2){
					Sound.playNote(Sound.XYLOPHONE, 165, 200);
				}else if(pitch == 3){
					Sound.playNote(Sound.XYLOPHONE, 175, 200);
				}else if(pitch == 4){
					Sound.playNote(Sound.XYLOPHONE, 196, 200);
				}else{
					Sound.playNote(Sound.XYLOPHONE, 220, 200);
				}
			}
			while (contact3.isPressed())
			{
				int distance = Sonic.getDistance();

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
					Sound.playNote(Sound.FLUTE, 73, 300);
				}else if(pitch == 2){
					Sound.playNote(Sound.FLUTE, 82, 300);
				}else if(pitch == 3){
					Sound.playNote(Sound.FLUTE, 87, 300);
				}else if(pitch == 4){
					Sound.playNote(Sound.FLUTE, 98, 300);
				}else{
					Sound.playNote(Sound.FLUTE, 110, 300);
				}
			}		
			if(Button.ESCAPE.isDown()){
				System.exit(0);
			}
			//Button.waitForAnyPress();
			//System.exit(0);
		}
	}
}








