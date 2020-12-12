package com.section5.exercises;

import java.util.Scanner;

public class exercise27_InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        String message = "Enter number ";

        int sum = 0;
        int counter = 0;
        long roundedAverage = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userInput = scanner.nextInt();
                counter++;
                sum += userInput;
                roundedAverage = Math.round((long)(sum / counter));
            } else {
                System.out.println("SUM = " + sum + " AVG = " + (long)roundedAverage);
                break;
            }
        }
    }
}
