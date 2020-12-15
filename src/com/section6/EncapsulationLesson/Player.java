package com.section6.EncapsulationLesson;

public class Player {

    // Using public scope for non-encapsulation:
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce lives
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
