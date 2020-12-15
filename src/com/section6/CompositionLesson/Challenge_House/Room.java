package com.section6.CompositionLesson.Challenge_House;

public class Room {

    // Room has doors, windows, floor
    private Door door;
    private Windows window;
    private Flooring floor;
    private Chair chair;
    private Dimensions dimensions;

    public Room(Door door, Windows window, Flooring floor, Chair chair, Dimensions dimensions) {
        this.door = door;
        this.window = window;
        this.floor = floor;
        this.chair = chair;
        this.dimensions = dimensions;
    }

    public Door getDoor() {
        return door;
    }

    public Windows getWindow() {
        return window;
    }

    public Flooring getFloor() {
        return floor;
    }

    public Chair getChair() {
        return chair;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
