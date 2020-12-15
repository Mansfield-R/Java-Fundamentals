package com.section6.CompositionLesson.Part2_Computer;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int gpuSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int gpuSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.gpuSlots = gpuSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getGpuSlots() {
        return gpuSlots;
    }

    public String getBios() {
        return bios;
    }
}
