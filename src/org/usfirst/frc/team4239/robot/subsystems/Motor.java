/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4239.robot.subsystems;

import org.usfirst.frc.team4239.robot.RobotMap;
import org.usfirst.frc.team4239.robot.commands.MotorStop;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Motor extends Subsystem {

	private Spark motor = new Spark(RobotMap.motor);
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new MotorStop());
	}
	
	public void motorForward(double speed) {
		motor.set(speed);
	}
	
	public void motorReverse(double speed) {
		motor.set(speed);
	}
	
	public void motorStop() {
		motor.set(0.0);
	}
}
