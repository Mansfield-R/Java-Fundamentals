package com.section8.Lessons;

import java.util.Arrays;

public class ReferencesVsValueTypes {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Referencing a single instance of an object, change one, changes both:
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // Change just one variable:
        anotherArray[0] = 1;

        // Above change actually changes both. Different than primitive int example above:
        // This happens because the reference types represent the address of the reference rather than the variable itself
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        // Method can also not modify a reference in memory:
        modifyArray(myIntArray);

        System.out.println("after method myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after method anotherArray = " + Arrays.toString(anotherArray));

        // You can change by dereferencing:
        anotherArray = new int[]{4,5,6,7,8};
        System.out.println("after method myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after new instance change anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        // Dereferencing:
        array = new int[] {1,2,3,4,5};
    }

}
