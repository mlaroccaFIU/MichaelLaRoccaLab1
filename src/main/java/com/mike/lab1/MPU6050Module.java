/**
 * 
 */
package com.mike.lab1;

/**
 * @author Michael La Rocca
 *
 */
public class MPU6050Module extends Sensor {

	private double gyro; //Gyro sensor measurement
	private double accelerometer; // Accelerometer sensor measurement
	private double motionProcessor; // Motion sensor measurement
	
	public void trackMotion() {
		//Records and measures robot's motion using motion processor
	}
	
	public void getDirection() {
		//Gets robot's pointed direction using accelerometer 
	}
	
	public void getAcceleration() {
		//Measures acceleration using accelerometer
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
	
	public void sendMesurement() {
		//Sends sensor measurement through control board
	}
}
