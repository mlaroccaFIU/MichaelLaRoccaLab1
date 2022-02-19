/**
 * 
 */
package com.mike.lab1;

/**
 * @author Michael La Rocca
 *
 */
public class MobileDeviceApp {

	private String operatingSystem;
	private double appVersion;
	
	public void connectWifi() {
		//Connects to the robot through LAN
	}
	
	public void sendMovement() {
		//Sends user's input for robot movement
	}
	
	public void viewLiveFeed() {
		//Sends live feed from robot's camera to the app UI
	}
	
	public void showStatus() {
		//Displays robot battery charge, sensor output, etc.
	}
	
	public void requestPhoto() {
		//Takes a photo of the robot camera's current view
	}
	
	public void requestVideo() {
		//Starts recording video from robot's camera feed
	}
	
	public void receiveNotification() {
		//Receives notifications from the Freenove cloud such fore example new update available
	}
	
	public void pushNotification() {
		//Pushes the Freenove cloud's notification to the user's device
	}
	
	public void receiveUpdateDisclaimer() {
		//Displays a disclaimer to the user before proceeding with a remote update to ensure batteries are fully charged
	}
	
	public void acceptUpdate() {
		//User input accepting to proceed with remote update
	}
	
	public void declineUpdate() {
		//User input declining to proceed with remote update
	}
	
	public void startRemoteUpdate() {
		//User input to start remote update once the update files have been downloaded locally to the Raspberry Pi
	}
}
