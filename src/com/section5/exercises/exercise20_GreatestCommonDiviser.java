package com.section5.exercises;

public class exercise20_GreatestCommonDiviser {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int x, int y) {

        int divisor = 0;

        if(x < 10 || y < 10) {
            return -1;
        } else {
            int counter = 0;
            while (counter <= x && counter <= y) {
                counter++;
                if (x % counter == 0 && y % counter == 0) {
                    divisor = counter;
                }
            }
            // Also works:
//            for (int i = 1; i <= x && i <= y; i++) {
//                if (x % i == 0 && y % i == 0) {
//                    divisor = i;
//                }
//            }
        }
        return divisor;
    }
}
