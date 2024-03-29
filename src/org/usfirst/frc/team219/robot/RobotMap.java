package org.usfirst.frc.team219.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static final int MOTOR_PORT_FL = 1;
	public static final int MOTOR_PORT_BL = 2;
	public static final int MOTOR_PORT_FR = 3;
	public static final int MOTOR_PORT_BR = 4;
	
	public static final int SHOOTER_L = 5;
	public static final int SHOOTER_R = 6;
	
	public static final int PIXEL_CONSTANT = 140;
	
	public static final int SHOOTER_FORWARD = 0;
	public static final int SHOOTER_REVERSE = 1;
	public static final int PCM_PORT = 15;
	
	
}
