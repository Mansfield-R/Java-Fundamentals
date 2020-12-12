package com.section6.InheritanceLesson.Vehicle;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private boolean isManual;
    private boolean isElectric;


    public Car(String name, String size, int wheels, int doors, boolean isManual, boolean isElectric) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.isElectric = isElectric;
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }
}
