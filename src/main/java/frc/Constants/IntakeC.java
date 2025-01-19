package frc.Constants;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class IntakeC {
    public static class IntakeConstants {
        public static int intakeMotorID = 9;
        public static final TalonFXConfiguration configs = new TalonFXConfiguration();
        public static final CurrentLimitsConfigs currentLimits = new CurrentLimitsConfigs()
        .withStatorCurrentLimit(80)
        .withStatorCurrentLimitEnable(true)
        .withSupplyCurrentLimitEnable(true);
    }
    
}
