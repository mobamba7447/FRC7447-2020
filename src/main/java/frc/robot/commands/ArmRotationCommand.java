/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmRotationCommand extends Command {
  public int direction;

  public ArmRotationCommand() {
    requires(Robot.armRotation);
    direction = -1;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(2.5);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.armRotation.turn(0.325 * direction);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
