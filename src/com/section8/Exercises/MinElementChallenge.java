package com.section8.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinElementChallenge {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = readIntegers();
        int[] array = readElements(number);
        System.out.println(findMin(array));

    }

    public static int readIntegers() {
        int userNumbers;
        System.out.println("Enter number of elements you need for array: ");
        userNumbers = scanner.nextInt();
        return userNumbers;
    }

    public static int[] readElements(int elements) {
        System.out.println("Now enter each element: ");
        int [] newArray = new int[elements];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static int findMin(int[] array) {
        Integer[] sortedArray = new Integer[array.length];
        int minimumNumber = 0;
        for (int i =0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray, Collections.reverseOrder());
        minimumNumber = sortedArray[sortedArray.length - 1];
        return minimumNumber;
    }

}
