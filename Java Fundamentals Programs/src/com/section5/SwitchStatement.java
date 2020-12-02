package com.section5;

public class SwitchStatement {

    public static void main(String[] args) {

        //  Hard coded, not efficient
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        /*
        Switch is good to use if you are testing the same variable and different values for that variable.
         */
        // Same as above but implementing with Switch statement:
        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        /*
        CHALLENGE:
         Create a new switch statement using char instead of int
         create a new char variable
         create a switch statement testing for
         A, B, C, D, or E
         display a message if any of these are found and then break
         Add a default which displays a message saying not found
         */

        char character = 'A';

        switch (character) {
            case 'A':
                System.out.println("Letter A was found.");
                break;
            case 'B':
                System.out.println("Letter B was found.");
                break;
            case 'C':
                System.out.println("Letter C was found");
                break;
            case 'D':
                System.out.println("Letter D was found.");
                break;
            case 'E':
                System.out.println("Letter E was found.");
                break;
            default:
                System.out.println("Letters A-E were not found");
                break;
        }

        // Switches with Strings:

        String month = "JanUary";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("What");
                break;
        }
    }
}
