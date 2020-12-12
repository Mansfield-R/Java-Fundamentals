package com.section5.exercises;

public class exercise25_LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    // Method:
    public static int getLargestPrime(int number) {

        int prime = number;

        if (number <= 1) {
            return -1;
        } else {
            int divisor = 2;
            while (divisor < prime) {
                if (prime % divisor != 0) {
                    divisor++;
                } else {
                    prime /= divisor;
                    divisor = 2;
                }
            }
        }
        return prime;
    }

}
