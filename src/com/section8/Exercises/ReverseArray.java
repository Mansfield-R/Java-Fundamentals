package com.section8.Exercises;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] testArray = {5, 6, 7, 8, 9, 10};
        reverse(testArray);

    }

    public static void reverse(int[] array) {

        // Print original array:
        System.out.println("Array = " + Arrays.toString(array));
        // Copy elements to new array to modify:
        int[] reversedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j -= 1;
        }
        System.out.println("Reversed Array = " + Arrays.toString(reversedArray));

    }
}
