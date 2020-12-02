package com.section5;

/*
Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

The method should not return any value (hint: void)

Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.

Bonus:
	Write a second solution using if then else, instead of using switch.
 */

public class dayOfTheWeekChallenge {

    public static void main(String[] args) {

        // Tuesday - CASE
        printDayOfTheWeek(2);
        //Invalid Day - CASE
        printDayOfTheWeek(8);

        // Wednesday - IFELSE
        printDayOfTheWeekIfElse(3);
        // Invalid Day - IFELSE
        printDayOfTheWeekIfElse(8);

    }

    // PrintDay Method:
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    // Bonus:
    public static void printDayOfTheWeekIfElse(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6 ) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }

    }

}
