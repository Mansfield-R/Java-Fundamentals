package com.section6.Inheritance.Animal;

// Extends keyword is how we inherit the super class:
public class Dog extends Animal {

    // Adding UNIQUE characteristics to our dog object, but we still get base characteristics from Animal class:
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Our constructor for a complete dog:
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // Call constructor from the class we are extending from:
        super(name, 1, 1, size, weight);
        // Set our unique characteristics (fields) of our Dog object:
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        // Execute the dog-specific chew method while eating
        chew();
        // Execute the eat method from the parent class
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
