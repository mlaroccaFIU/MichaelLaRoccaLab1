/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class ServoMotor implements SelfCheckCapable {

	private double size;
	private double torque;
	private String gearType; // MG996 servo used for legs or S90 servo used for head
	private int capacity;
	private int rotationDegree;
	private int voltage;
	
	public void activate() {
		//Starts servo motor gears based on received commands from user->Pi->Control board
	}
	
	public void deactivate() {
		//Stops servo motor gears based
	}
	
	public void accelerate() {
		//Accelerates gear movement
	}
	
	public void relax() {
		//Brings legs to a curled state when Relax mode is activated
	}
	
	public void rotatenGearM03() {
		//Gears move clockwise 
	}
	
	public void rotateGearM04() {
		//Gears move counter clockwise
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ServoMotor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
