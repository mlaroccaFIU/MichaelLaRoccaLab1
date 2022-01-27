/**
 * 
 */
package com.mike.lab1;

/**
 * @author Michael La Rocca
 *
 */
public class ControlBoard extends CircuitBoard {

	private String sensorPort;
	private String ultrasonicPort;
	private String servoPort;
	private String ledPort;
	private String dcSocket;
	
	public void sendPi() {
		//Send data or commands to Raspberry Pi
	}
	
	public void receivePi() {
		//Receives data or commands from Raspberry Pi
	}
	
	public void getPower() {
		//Receives power from batteries
	}
	
	public void receiveSensorData() {
		//Receives measurment data from ultrasonic and MPU6050 modules
	}
	
	
}
