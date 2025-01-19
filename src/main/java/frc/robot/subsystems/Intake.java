// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.Constants.IntakeC;
import frc.Constants.IntakeC.IntakeConstants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private final TalonFX intakeMotor = new TalonFX(IntakeC.IntakeConstants.intakeMotorID, "rio");
 
  public Intake() {
  /* Configure the motor's factory default settings */
    intakeMotor.getConfigurator().apply(IntakeConstants.configs);
    /*Apply a current configuration to the motor */
    intakeMotor.getConfigurator().refresh(IntakeConstants.currentLimits);
    intakeMotor.getConfigurator().apply(IntakeConstants.currentLimits);
  }

    /**
    * Method to run intake a particuar setpoint 
    *@param setpoint the percent outut at which the intake should run.
    */
    public void runIntake(double setpoint) {
      intakeMotor.set(setpoint);
    }
    public void pullIntake() {
      intakeMotor.set(0.2);
    }
    public void stopInake() {
      intakeMotor.stopMotor();
   }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Intake Percent Outpet", intakeMotor.get());
  }
}
