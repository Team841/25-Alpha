package frc.robot.Constants;

import com.ctre.phoenix6.configs.*;
import com.ctre.phoenix6.signals.FeedbackSensorSourceValue;

public class ManipulatorConstants {
    public static class Shooter{
        public static int intakeMotorID = 9;
        public static final TalonFXConfiguration configs = new TalonFXConfiguration();
        public static final CurrentLimitsConfigs currentLimits = new CurrentLimitsConfigs()
                .withStatorCurrentLimit(60)
                .withStatorCurrentLimitEnable(true)
                .withSupplyCurrentLimitEnable(true);
    }

    public static class Indexer{
        public static int indexerMotorID = 11;
        public static final TalonFXConfiguration configs = new TalonFXConfiguration();
        public static final CurrentLimitsConfigs currentLimits = new CurrentLimitsConfigs()
                .withStatorCurrentLimit(60)
                .withStatorCurrentLimitEnable(true)
                .withSupplyCurrentLimitEnable(true);
    }

    public static class Escalator{
        public static int left = 10;
        public static int right = 17;
        public static Slot0Configs slot0Configs = new Slot0Configs()
                .withKP(0.9).withKD(0.01);
        public static double FF = 0.02;
        public static final TalonFXConfiguration configs = new TalonFXConfiguration()
                .withSlot0(slot0Configs)
                .withCurrentLimits(
                        new CurrentLimitsConfigs()
                                .withStatorCurrentLimit(60)
                                .withStatorCurrentLimitEnable(true)
                                .withSupplyCurrentLimitEnable(true)
                )
                .withFeedback(
                        new FeedbackConfigs()
                                .withFeedbackSensorSource(FeedbackSensorSourceValue.RotorSensor)
                );
        public static int SensorID = 0;
    }
}
