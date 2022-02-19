/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class UltrasonicModule extends Sensor implements SelfCheckCapable {

	private double transmitter;
	private double receiver;
	
	public void calculateDistance() {
		//Measures distance between sensor and obstacle 
	}
	
	public void detectObject() {
		//Detects obstacles in path
	}
	
	public void sendMeasurement() {
		//Sends distance measurements and object readings
	}
	
	public void runCalibration() {
		//Runs sensor calibration commands
	}
	
	public void runTest() {
		//Runs sensor test scenarios defined by Freenove Cloud
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UltrasonicModule";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
