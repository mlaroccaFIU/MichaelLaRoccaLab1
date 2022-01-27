/**
 * 
 */
package com.mike.lab1;

/**
 * @author Michael La Rocca
 *
 */
public class RaspberryPi extends CircuitBoard {

	private String operatingSystem;
	private boolean onoffState;
	
	public void turnOn() {
		//Turns on Raspberry Pi when power source is detected
	}
	
	public void turnOff() {
		//Turns off Raspberry Pi when power source is detected
	}
	
	public void receiveAppCommand() {
		//Receives user input from mobile device application
	}
	
	public void receiveSensorData() {
		//Receives measurement data from sensors
	}
	
	public void receiveCameraData() {
		//Receives recorded photos, videos, or live feeds from camera
	}
	
	public void sendCameraCommand() {
		//Sends commands to camera to take photo, record video, or stream live feed
	}
	
	public void sendSensorCommand() {
		//Sends commands to sensor to record measurements
	}
	
	public void triggerBuzzer() {
		//Triggers robot's buzzer based on threshold conditions
	}
	
	public void sendAppData() {
		//Sends output data to user's mobile device application
	}
}
