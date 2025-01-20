package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ManipulatorConstants;

public class Indexer extends SubsystemBase {

    private final TalonFX indexerMotor = new TalonFX(ManipulatorConstants.Indexer.indexerMotorID, "rio");

    public Indexer(){
        /* Configure the motor's factory default settings */
        indexerMotor.getConfigurator().apply(ManipulatorConstants.Indexer.configs);
        /*Apply a current configuration to the motor */
        indexerMotor.getConfigurator().refresh(ManipulatorConstants.Indexer.configs);
        indexerMotor.getConfigurator().apply(ManipulatorConstants.Indexer.configs);
    }

    @Override
    public void periodic() {

    }

    public void intake() {
        indexerMotor.set(-0.5);
    }

    public void stop() {
        indexerMotor.stopMotor();
    }

}
