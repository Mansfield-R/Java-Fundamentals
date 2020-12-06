package com.section5;

public class exercise14_isOdd {

    public static void main(String[] args) {

        // should return 2500
        System.out.println(sumOdd(1, 100));
        // should return -1;
        System.out.println(sumOdd(-1, 100));
        // should return 0;
        System.out.println(sumOdd(100,100));

    }

    // isOdd Method:
    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        } else if(number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // sumOdd method:
    public static int sumOdd(int start, int end) {

        // returning sum
        int sum = 0;

        // if the end is not greater than the start or both start and end aren't greater than zero logic
        if (!(end >= start) || !(start > 0) ||  !(end > 0)) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

}
