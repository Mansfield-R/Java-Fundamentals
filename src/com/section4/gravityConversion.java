package com.section4;

import java.util.Scanner;

public class gravityConversion {

    public static void main(String[] args) {

        // All Variables for conversion
        double moon_weight, earth_weight, earth_gravity, moon_gravity, rounded_weight;

        earth_gravity = 9.81;
        moon_gravity = 1.622;

        // Scanner for user input:
        Scanner in = new Scanner(System.in);

        // Prompt user to enter their weight they want to convert:
        System.out.println("Enter the weight you want converted to moon weight:");
        earth_weight = in.nextDouble();

        // Convert
        moon_weight = (earth_weight / earth_gravity) * moon_gravity;
        rounded_weight = Math.round(moon_weight * 100.0) / 100.0;

        System.out.println("Your earth weight you input: " + earth_weight);
        System.out.println("Your moon weight: " + rounded_weight);
    }
}
