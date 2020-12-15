package com.section6.CompositionLesson.Challenge_House;

public class Flooring {

    private String material;
    private Dimensions dimensions;
    private boolean isHeated;

    public Flooring(String material, Dimensions dimensions, boolean isHeated) {
        this.material = material;
        this.dimensions = dimensions;
        this.isHeated = isHeated;
    }

    // If isHeated: Turn Heat on or Off:
    public void turnHeatOn() {
        if (isHeated) {
            System.out.println("Heating up the floors");
        } else {
            System.out.println("You don't have heated floors");
        }
    }

    public  void turnHeatOff() {
        if (isHeated) {
            System.out.println("Turning off the heated floors");
        } else {
            System.out.println("You don't have heated floors");
        }
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isHeated() {
        return isHeated;
    }
}
