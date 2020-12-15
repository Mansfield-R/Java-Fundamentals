package com.section6.CompositionLesson.Challenge_House;

public class Windows {

    private int panes;
    private int locks;
    private int numberOfWindows;
    private boolean hasBlinds;

    public Windows(int panes, int locks, int numberOfWindows, boolean hasBlinds) {
        this.panes = panes;
        this.locks = locks;
        this.numberOfWindows = numberOfWindows;
        this.hasBlinds = hasBlinds;
    }

    // Can be opened / Closed and locked and unlocked:
    public void open() {
        System.out.println("Window is open");
    }

    public void close() {
        System.out.println("Window is closed");
    }

    // Door can lock and unlock
    public void lock() {
        System.out.println("Window is locked");
    }

    public void unlock() {
        System.out.println("Window is unlocked");
    }


    public int getPanes() {
        return panes;
    }

    public int getLocks() {
        return locks;
    }

    public boolean isHasBlinds() {
        return hasBlinds;
    }
}
