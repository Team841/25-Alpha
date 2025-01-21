package frc.robot.subsystems;

import com.ctre.phoenix6.configs.MotorOutputConfigs;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.PositionDutyCycle;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ManipulatorConstants;

public class Escalator extends SubsystemBase {

    private final TalonFX leftMotor = new TalonFX(ManipulatorConstants.Escalator.left);
    private final TalonFX rightMotor = new TalonFX(ManipulatorConstants.Escalator.right);

    private final DigitalInput sensor = new DigitalInput(ManipulatorConstants.Escalator.SensorID);

    private final PositionDutyCycle control;
    private final Follower leftFollower;

    public Escalator() {
        this.leftMotor.getConfigurator().apply(ManipulatorConstants.Escalator.configs);
        this.rightMotor.getConfigurator().apply(ManipulatorConstants.Escalator.configs);

        this.control = new PositionDutyCycle(0);
        this.control.FeedForward = ManipulatorConstants.Escalator.FF;
        this.control.Velocity = 5;
        this.leftFollower = new Follower(ManipulatorConstants.Escalator.right, true);

    }

    @Override
    public void periodic() {
        SmartDashboard.putBoolean("Sensor ID", !sensor.get());
        SmartDashboard.putNumber("Motor Pos", rightMotor.getPosition().getValueAsDouble());
        SmartDashboard.putNumber("setpoint", control.Position);
        if (!sensor.get()){
            leftMotor.setPosition(0);
            rightMotor.setPosition(0);
        }
    }

    public void setPosition(double Position){
        rightMotor.setControl(this.control.withPosition(Position));
    }

    public void stop(){
        rightMotor.stopMotor();
    }

    public void goUp(){
        rightMotor.set(0.2);
    }

    public void goDown(){
        rightMotor.set(-0.2);
    }

}
