/**
 * 
 */
package com.mike.lab1;

/**
 * @author Michael La Rocca
 *
 */
public class ServoMotor {

	private double size;
	private double torque;
	private String gearType; // MG996 servo used for legs or S90 servo used for head
	private int capacity;
	private int rotationDegree;
	private int voltage;
	
	public void start() {
		//Starts servo motor gears based on received commands from user->Pi->Control board
	}
	
	public void rotatenGearM03() {
		//Gears move clockwise 
	}
	
	public void rotateGearM04() {
		//Gears move counter clockwise
	}
	
	public void accelerate() {
		//Accelerates gear movement
	}
}
