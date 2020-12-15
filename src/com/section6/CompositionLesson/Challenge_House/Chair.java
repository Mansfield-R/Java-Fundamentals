package com.section6.CompositionLesson.Challenge_House;

public class Chair {

    private String manufacturer;
    private String materialType;
    private String color;
    private int legs;

    public Chair(String manufacturer, String materialType, String color, int legs) {
        this.manufacturer = manufacturer;
        this.materialType = materialType;
        this.color = color;
        this.legs = legs;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterialType() {
        return materialType;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }
}
