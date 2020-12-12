package com.section5.exercises;

public class exercise16_SumFirstAndLastDigit {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));

    }

    // Method:
    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int firstDigit = number;

        if (number < 0) {
            return -1;
        } else {
            int lastNumber = number % 10;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            sum = lastNumber + firstDigit;
        }
        return sum;
    }
}
