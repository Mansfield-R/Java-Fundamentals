package com.section8;

public class Array {

    public static void main(String[] args) {
        // Arrays work for primitives and objects:
        int[] myIntArray;
        // assign memory / elements (space) for the array we just declared:
        myIntArray = new int[10];

        // If you know ahead of time the size of the array and elements needed do this:
        int[] mySecondIntArray = {1,2,3,4,5,6,7,8,9,10};

        // 3rd way to initialize:
        int[] myThirdIntArray = new int[10];
        for (int i = 0; i < 10; i++) {
            // Go through each element; each element is multiplied by 10;
            myThirdIntArray[i] = i * 10;
        }
        // Now print out the array you just initialized with a for loop, with another for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myThirdIntArray[i]);
        }

        // Give the array a value of 50 at spot 6 in the array:
        myIntArray[5] = 50;
        // Print out and access element 6 in the array we made:
        System.out.println(myIntArray[5]);
    }

    // Method to print out an array you pass in, same logic as lines 20-23 in here.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
