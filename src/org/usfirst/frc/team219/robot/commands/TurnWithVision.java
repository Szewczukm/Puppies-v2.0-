package org.usfirst.frc.team219.robot.commands;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;


/**
 *
 */
public class TurnWithVision extends CommandBase {
	
	private double startX,currX;
	private int leftRight;
	
    public TurnWithVision() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startX = vision.getXVal();
    	leftRight = vision.turnRight();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(leftRight==1){
    		drivetrain.setTalonSpeed(.2, .2);
    	}
    	else if(leftRight==-1){
    		drivetrain.setTalonSpeed(-.15, -.15);
    	}
    	currX = vision.getXVal();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return ((vision.getXVal() <=157 && vision.getXVal()>=135));
		
    }

    // Called once after isFinished returns true
    protected void end() {
    	drivetrain.setTalonSpeed(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
