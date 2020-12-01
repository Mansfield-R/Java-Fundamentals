package com.section4;

/*
METHOD OVERLOADING EXAMPLE:

1.)
Create a method called calcFeetAndInchesToCentimeters.

Has two parameters: Feet and Inches both of TYPE Double.
Validate parameters > than 0 and inches are less than 12 but greater than zero
return -1 if the above isn't true.

- If true: calculate how many centimeters comprise the feet and inches passed to this method and return that value.

2.)

Create 2nd method of same name but only one parameter of Inches that is of type double.
- Validate it is greater than or equal to 0.
- return -1 if not true
- *** If true: calculate how many feet are in the inches given. CALL the other overloaded method passing the correct
feet and inches calculated so that it can calculate correctly.
 */

public class feetAndInchesChallenge {

    public static void main(String[] args) {

        // Using inches to feet of overloaded 1 parameter method.
        calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(18.00), 8);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double centimetersOfFeet;
        double centimetersOfInches;
        double totalCentimeters;

        if (feet >= 0 && inches >= 0 && inches <=12) {
            centimetersOfFeet = ((feet * 12.00) * 2.54);
            centimetersOfInches = ((inches * 2.54));
            totalCentimeters = centimetersOfFeet + centimetersOfInches;
            System.out.println(feet + " feet + " + inches + " inches = " + totalCentimeters + " centimeters");
        } else {
            totalCentimeters = -1;
        }
        return totalCentimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        double feetOfInches;

        if (inches >= 0) {
            feetOfInches = inches / 12.00;
        } else {
            feetOfInches = -1;
        }
        return feetOfInches;

    }



}
