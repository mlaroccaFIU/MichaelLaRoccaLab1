/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class Accelerometer implements SelfCheckCapable {

	private int pulseWidthModulation;
	private int sensitivity;
	
	public void trackMotion() {
		//Records and measures robot's motion using motion processor
	}
	
	public void getAcceleration() {
		//Measures acceleration using accelerometer
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Accelerometer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
