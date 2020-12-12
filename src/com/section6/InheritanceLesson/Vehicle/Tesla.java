package com.section6.InheritanceLesson.Vehicle;

public class Tesla extends Car{

    // My personal take on a Tesla characteristics we need to have for this challenge:
    private int superChargerMonths;
    private boolean isLongRange;
    private boolean hasAutopilot;

    public Tesla(String size, int wheels, int doors, int superChargerMonths, boolean isLongRange, boolean hasAutopilot) {
        super("Tesla", size, wheels, doors, false, true);

        this.superChargerMonths = superChargerMonths;
        this.isLongRange = isLongRange;
        this.hasAutopilot = hasAutopilot;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
