package com.section5;

public class exercise18_SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    // Method:
    public static boolean hasSharedDigit(int number1, int number2) {

        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            int lastNumber1 = 0;
            int lastNumber2 = 0;
            int firstNumber1 = number1;
            int firstNumber2 = number2;

            lastNumber1 = number1 % 10;
            while (firstNumber1 >= 10) {
                firstNumber1 /= 10;
            }

            lastNumber2 = number2 % 10;
            while (firstNumber2 >= 10) {
                firstNumber2 /= 10;
            }

            if (firstNumber1 == firstNumber2
                    || firstNumber1 == lastNumber2
                    || firstNumber2 == lastNumber1
                    || lastNumber2 == lastNumber1) {
                return true;
            } else{
                return false;
            }
        }

    }

}
