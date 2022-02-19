/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class FreenoveCloud implements SelfCheckCapable {

	public void sendNotification() {
		//Sends notifications through Raspberry Pi's Freenove update client or mobile device app
	}
	
	public void sendUpdateDisclaimer() {
		//Sends disclaimer to the user before proceeding with a remote update to ensure batteries are fully charged
	}
	
	public void sendUpdatePackage() {
		//Freenove update packages downloads to the Raspbery Pi through the update client
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FreenoveCloud";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
