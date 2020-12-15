package com.section6.EncapsulationLesson;

// We are going to create a class that doesn't use encapsulation and then a class that does for this lesson

public class Main {

    public static void main(String[] args) {

        // Can set to public because fields are not private in Player class: (BAD in this fictional game setting)
        Player player = new Player();
        player.name = "Rick";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // Since these are public we are opening game up to manipulation.
        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // Create  a new class with Proper encapsulation:
        EnhancedPlayer player2 = new EnhancedPlayer("Tim",50,"sword");
        // Forced to get player 2 health using the getter. Cannot modify the player health directly.
        System.out.println("Initial health is " + player2.getHealth());

    }
}
