package com.section6.InheritanceLesson.Animal;

public class Main {

    public static void main(String[] args) {

        // Create Animal
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        // Create Dog:
        Dog yorkie = new Dog("Yorkie",8, 20, 2, 4, 1, 20, "Silky");
        // Eat method was defined in Animal parent class, so even though it isn't visible in Dog class it inherited the method:
        yorkie.eat();

        // Walk method is specific to Dog class at specific speed
        yorkie.walk();
        // Same with run method
        yorkie.run();

    }
}
