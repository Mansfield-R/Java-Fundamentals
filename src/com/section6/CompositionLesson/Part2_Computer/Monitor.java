package com.section6.CompositionLesson.Part2_Computer;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;

    // This is an example of Composition: The resolution class HAS a resolution but is not a resolution.
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }
}
