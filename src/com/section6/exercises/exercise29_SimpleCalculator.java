package com.section6.exercises;

public class exercise29_SimpleCalculator {

    // Object Needs two fields:
    private double firstNumber;
    private double secondNumber;

    // Getter and Setter Methods:
    /*
    We use setter methods to be able to give access to outside classes to create an instance of our object here and set their own fields
    We use getter methods to return the fields that were set in the setter.
    Open-Closed principle?????!?!?! As part of SOLID???!?!?!
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0;
        } else {
            return (firstNumber / secondNumber);
        }
    }

}
