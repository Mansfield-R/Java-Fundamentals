package com.section6.Inheritance.Animal;

// This is the base class of all animals:
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // All animals need to eat:
    public void eat() {
        System.out.println("Animal.eat() called");
    }

    // All animals need to move:
    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
