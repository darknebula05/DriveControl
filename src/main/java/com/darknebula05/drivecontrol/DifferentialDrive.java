package com.darknebula05.drivecontrol;

import edu.wpi.first.wpilibj.SpeedController;

public class DifferentialDrive {
    private final SpeedController leftMotor;
    private final SpeedController rightMotor;
    public DifferentialDrive(SpeedController leftMotor, SpeedController rightMotor) {
        this.leftMotor = leftMotor;
        this.rightMotor = rightMotor;
    }
}
