/**
 * 
 */
package com.mike.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.EmptyComponent;
import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * Robot main class
 * @author Michael La Rocca
 *
 */
public class Robot implements GenericComponent {
	
	private String model;
	private String hexpod;
	private String gaitType;
	private int speed; //Measurement in Mph
	private boolean onOffSate;
	private RaspberryPi myPi;
	private ServoMotor myServoMotor;
	private UpdateClient myUpdateClient;
	private UltrasonicModule myUltrasonicModule;
	private MobileDeviceApp myMobileDeviceApp;
	private Gyro myGyro;
	private FreenoveCloud myFreenoveCloud;
	private ControlBoard myControlBoard;
	private Camera myCamera;
	private Accelerometer myAccelerometer;
	private RechargeableBattery myBattery;
	public Robot() {
		myPi = new RaspberryPi();
		myServoMotor = new ServoMotor();
		myUpdateClient = new UpdateClient();
		myUltrasonicModule = new UltrasonicModule();
		myMobileDeviceApp = new MobileDeviceApp();
		myFreenoveCloud = new FreenoveCloud();
		myControlBoard = new ControlBoard();
		myCamera = new Camera();
		myAccelerometer = new Accelerometer();
		myGyro = new Gyro();
		myBattery = new RechargeableBattery();
		
	}
	
	public void powerOn() {
		//Power off hexapod robot
	}
	
	public void powerOff() {
		//Power off hexapod robot
	}
	
	public void activateRelaxMode() {
		//Servo motors are activated while robot is in a curled position
	}
	
	public void selfBalance() {
		//Maintains balance automatically by using input from the gyro sensor
	}
	
	public void crawlForward() {
		//Move robot forward 
	}
	
	public void crawlBackward() {
		//Move robot backward
	}
	
	public void rotateLeft() {
		//Rotate robot left
	}
	
	public void rotateRight() {
		//Rotate robot right
	}
	
	public void sideStepLeft() {
		//Moves robot perpendicular to the left  
	}
	
	public void sideStepRight() {
		//Moves robot perpendicular to the right  
	}
	
	public void liftUp() {
		//Legs flex to lift up robot's body
	}
	
	public void bendDown() {
		//Bends legs down to lower robot's body
	}
	
	public void stop() {
		//Stops all movements
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Freenove Big Hexapod Robot";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myPi, myServoMotor, myUpdateClient, myUltrasonicModule, myMobileDeviceApp, myGyro, myFreenoveCloud, myControlBoard, myCamera, myAccelerometer, myBattery); // add all your sub components
		return internalComponents;	}

}
