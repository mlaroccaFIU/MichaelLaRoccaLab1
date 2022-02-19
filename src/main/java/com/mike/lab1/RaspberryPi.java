/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class RaspberryPi extends CircuitBoard implements SelfCheckCapable {

	private String operatingSystem;
	private boolean onOffState;
	
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
	
	public void calibrateUltrasonic() {
		//Sends ultrasonic calibration operations to the module
	}
	
	public void downloadUpdatePackage() {
		//Downloads the Freenove update files through the update client
	}
	
	public void installUpdatePackage() {
		//Installs the download Freenove update package
	}
	
	public void verifyVoltage() {
		//Verify the power input voltage meets requirements
	}
	
	public void updateRaspbian() {
		//Updates the Raspberry Pi's operating system to the latest version of Raspbian
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RaspberryPi";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
