package com.section5;

public class parsingValuesFromStringLesson {

    public static void main(String[] args) {
        String numberAsString = "2018";
        String numberAsDouble = "2018.255";
        System.out.println("numberAsString = " + numberAsString);

        // Can convert string to various primitive types:
        // First use of Java Wrapper Class of type Int:
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        // Java will automatically convert number to string and concatenate as shown here:
        numberAsString += 1;

        // Since string was converted to INT here: will actually add
        number += 1;

        //Testing both
        System.out.println(numberAsString);
        System.out.println(number);

        // Double:
        double number2 = Double.parseDouble(numberAsDouble);
        System.out.println(number2);
    }

}
