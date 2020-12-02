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
    }

}
