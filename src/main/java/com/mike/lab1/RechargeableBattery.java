/**
 * 
 */
package com.mike.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class RechargeableBattery implements SelfCheckCapable {

	private int voltage;
	private double size;
	private int chargeState;
	
	public void charge() {
		//Recharges batter when plugged in
	}
	
	public void sendPower() {
		//Sends power for robot functions through the control board
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RechargeableBattery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
