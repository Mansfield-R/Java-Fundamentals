package com.section5;

public class whileLoopLesson {

    public static void main(String[] args) {

        // Simple logic:
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
        }

        // Can set whole while loop to true and have internal logic that tests for false in order to break and stop loop
        // when it does turn false
        count = 1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // Example of above where code might not execute at all:
        count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
        }

        // Do-While Loop
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        // Do-While where there is an error in how many times it loops:
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);
    }

}
