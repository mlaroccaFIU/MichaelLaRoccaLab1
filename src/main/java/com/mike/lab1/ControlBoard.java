/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class ControlBoard extends CircuitBoard implements SelfCheckCapable {

	private String sensorPort;
	private String ultrasonicPort;
	private String servoPort;
	private String ledPort;
	
	public void sendPi() {
		//Send data or commands to Raspberry Pi
	}
	
	public void receivePi() {
		//Receives data or commands from Raspberry Pi
	}
	
	public void getPower() {
		//Receives power from batteries
	}
	
	public void controlServoPower() {
		//Controls the power output to the servo motors
	}
	
	public void receiveSensorData() {
		//Receives measurment data from ultrasonic and MPU6050 modules
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ControlBoard";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
