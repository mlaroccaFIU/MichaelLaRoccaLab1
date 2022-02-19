/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class Camera implements SelfCheckCapable {

	private int horizResolution;
	private int vertResolution;
	private boolean onoffState;
	
	public void recordPhoto() {
		//Takes a photo and saves to internal storage
	}
	
	public void recordVideo() {
		//Records video clip and saves to internal storage
	}
	
	public void streamVideo() {
		//Streams live feed feed to mobile device
	}
	
	public void turnOn() {
		//Turns on camera	
	}
	
	public void turnOff() {
		//Turns off camera
	}
	
	public void facialRecognition() {
		//Uses biometric mapping and learning to recognize the user
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}

