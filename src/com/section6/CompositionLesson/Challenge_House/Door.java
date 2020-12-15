package com.section6.CompositionLesson.Challenge_House;

public class Door {

    private String material;
    private String color;
    private int knobs;
    private int locks;

    public Door(String material, String color, int knobs, int locks) {
        this.material = material;
        this.color = color;
        this.knobs = knobs;
        this.locks = locks;
    }

    // Door can open / close:
    public void open() {
        System.out.println("Door is open");
    }

    public void close() {
        System.out.println("Door is closed");
    }

    // Door can lock and unlock
    public void lock() {
        System.out.println("Door is locked");
    }

    public void unlock() {
        System.out.println("Door is unlocked");
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getKnobs() {
        return knobs;
    }

    public int getLocks() {
        return locks;
    }
}
