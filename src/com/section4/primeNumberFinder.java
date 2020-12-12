package com.section4;

public class primeNumberFinder {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i <= 100; i++) {

            int counter = 0;

            for (num = i; num >=1; num--){
                if (i % num == 0) {
                    counter++;
                }
            }

        }

    }
}
