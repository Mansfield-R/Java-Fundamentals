package com.section8.Lessons;

import java.util.Scanner;

public class UserInputArrayUseCase {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Make an array for test:
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element: " + i + ", typed value was: " + myIntegers[i]);
        }

        System.out.println("The average is: " + getAverage(myIntegers));
        
    }
    
    // Method to take the size of array you want entered and initialize the array:
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        // Create new int array based on passed number
        int[] values = new int[number];
        // For each value, take user input to insert into array:
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // Method to calculate the average of the array you entered:
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Returning a double since possibility of non-whole numbers.
        return (double) sum / (double)array.length;
    }
}
