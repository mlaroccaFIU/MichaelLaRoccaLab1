/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.EmptyComponent;

/**
 * Robot main class
 * @author Michael La Rocca
 *
 */
public class Robot extends EmptyComponent{
	
	private String model;
	private String hexpod;
	private String gaitType;
	private int speed; //Measurement in Mph
	private boolean onOffSate;
	
	public void powerOn() {
		//Power off hexapod robot
	}
	
	public void powerOff() {
		//Power off hexapod robot
	}
	
	public void activateRelaxMode() {
		//Servo motors are activated while robot is in a curled position
	}
	
	public void selfBalance() {
		//Maintains balance automatically by using input from the gyro sensor
	}
	
	public void crawlForward() {
		//Move robot forward 
	}
	
	public void crawlBackward() {
		//Move robot backward
	}
	
	public void twistLeft() {
		//Rotate robot left
	}
	
	public void twistRight() {
		//Rotate robot right
	}
	
	public void sideStepLeft() {
		//Moves robot perpendicular to the left  
	}
	
	public void sideStepRight() {
		//Moves robot perpendicular to the right  
	}
	
	public void liftUp() {
		//Legs flex to lift up robot's body
	}
	
	public void bendDown() {
		//Bends legs down to lower robot's body
	}
	
	public void stop() {
		//Stops all movements
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

}
