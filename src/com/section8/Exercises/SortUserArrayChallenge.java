package com.section8.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortUserArrayChallenge {

    public static void main(String[] args) {

        // Test:
        int [] toBeSortedArray = getIntegers(5);
        int [] timSort = toBeSortedArray;

        int [] sortedArray = sortIntegers(toBeSortedArray);
        int [] sortedArray2 = sortIntegersTim(timSort);

        printArray(sortedArray);
        System.out.println("");
        printArray(sortedArray2);

    }

    // Get Integer and Create Array logic
    public static int[] getIntegers(int number) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
        int [] newArray = new int[number];
        // For each value, take user input to insert into array:
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    // Method to print out an array you pass in, same logic as lines 20-23 in here.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    // Sort the array with Collections.reverseOrder logic:
    public static int[] sortIntegers(int[] arrayToBeSorted) {

        // Variables for sorting:
        Integer[] objectIntegerArray = new Integer[arrayToBeSorted.length];
        int[] sortedArray = new int[arrayToBeSorted.length];

        // Loop through primitive array, put into object array for Arrays.sort:
        for (int i = 0; i < arrayToBeSorted.length; i++) {
            objectIntegerArray[i] = arrayToBeSorted[i];
        }

        // Integer Object Sorting:
        Arrays.sort(objectIntegerArray, Collections.reverseOrder());

        // Back to Primitive array:
        for (int i = 0; i < objectIntegerArray.length; i++) {
            sortedArray[i] = objectIntegerArray[i];
        }

        return sortedArray;
    }

    // Tim Buchalkas version:
    public static int[] sortIntegersTim(int [] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        // Boolean to make the while loop run at least once:
        boolean flag = true;
        int temp;

        // While the flag is true, go through the array,
        while (flag) {
            // Logic Breaker:
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]){
                    // Take entry of element at position 1 and swap it with element position 0 using the temporary variable
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    // Logic Breaker:
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
