// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ManipulatorConstants;

public class Shooter extends SubsystemBase {
    /**
     * Creates a new Shooter.
     */
    private final TalonFX intakeMotor = new TalonFX(ManipulatorConstants.Shooter.intakeMotorID, "rio");

    public Shooter() {
        /* Configure the motor's factory default settings */
        intakeMotor.getConfigurator().apply(ManipulatorConstants.Shooter.configs);
        /*Apply a current configuration to the motor */
        intakeMotor.getConfigurator().refresh(ManipulatorConstants.Shooter.currentLimits);
        intakeMotor.getConfigurator().apply(ManipulatorConstants.Shooter.currentLimits);
    }

    /**
     * Method to run intake a particuar setpoint
     *
     * @param setpoint the percent outut at which the intake should run.
     */
    public void runIntake(double setpoint) {
        intakeMotor.set(setpoint);
    }

    public void slowShooter(){
        intakeMotor.set(0.075);
    }

    public void pullIntake() {
        intakeMotor.set(0.3);
    }

    public void stop() {
        intakeMotor.stopMotor();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putNumber("Shooter Percent Outpet", intakeMotor.get());
    }
}
