/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class UpdateClient implements SelfCheckCapable {

	private double clientVersion;
	
	public void checkUpdates() {
		//Checks if there are available updates from the Freenove Cloud
	}
	
	public void requestUpdatePackage() {
		//Request Freenove Cloud to download update files
	}
	
	public void piCommandUpdateRaspbian() {
		//Sends a command to the Pi to update to the latest Raspbian version if a Freenove update requires it
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UpdateClient";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
