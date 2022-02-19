/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class Gyro implements SelfCheckCapable {

	private String threeAxis;
	
	public void getDirection() {
		//Gets robot's pointed direction using accelerometer 
	}
	
	public void getOrientationX() {
		//Measures gyro X axis orientation
	}
	
	public void getOrientationY() {
		//Measures gyro Y axis orientation
	}
	
	public void getOrientationZ() {
		//Measures gyro Z axis orientation
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Gyro";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
