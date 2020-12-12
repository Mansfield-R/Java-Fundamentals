package com.section6.InheritanceLesson.Vehicle;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("AWD", 4, 4, 6, true,true);
        // Accelerate to 30 mph.
        tesla.accelerate(30);
        // Steer at 45 degrees
        tesla.steer(45);
    }

}
