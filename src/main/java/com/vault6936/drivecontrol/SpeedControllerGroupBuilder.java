package com.vault6936.drivecontrol;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import java.util.ArrayList;
import java.util.List;

public class SpeedControllerGroupBuilder {
    private final List<SpeedController> speedControllers = new ArrayList<>();

    public SpeedControllerGroupBuilder addSpeedController(SpeedController speedController, boolean inverted) {
        speedController.setInverted(inverted);
        speedControllers.add(speedController);
        return this;
    }

    public SpeedControllerGroup build() {
        return new SpeedControllerGroup((SpeedController[]) speedControllers.toArray());
    }
}
