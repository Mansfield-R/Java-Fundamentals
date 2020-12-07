package com.section5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minimumAndMaximumChallenge {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String message = "Enter number ";

        int counter = 0;

        while (counter < 5) {

            int order = counter + 1;

            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userNumber = scanner.nextInt();
                arrayList.add(userNumber);
                counter++;
            } else {
                System.out.println("Invalid number");
            }
        }
        Collections.sort(arrayList);
        System.out.println("Max number: " + arrayList.get(0));
        System.out.println("Min number: " + arrayList.get(4));
        scanner.close();
    }

}
