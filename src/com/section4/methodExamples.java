package com.section4;

public class methodExamples {

    public static void main(String[] args) {

        int levelCompleted = 5;
        int bonus = 100;

        // Entirely script based, all hardcoded and nothing passed into V1 method.
        calculateScore();

        // Hard coding the values passed; No user input using V2
        calculateScoreV2(true, 800, levelCompleted, bonus);

    }

    // Basic Method without returning anything. This is like a script that main is calling etc..
    public static void calculateScore() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score is: " + finalScore );
        }

    }

    // Basic Method WITH parameters being passed in to achieve the same level completion calculation.
    public static void calculateScoreV2 (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score is: " + finalScore );        }

    }

    // Basic Method to RETURN a value to be used somewhere else:
    public static int calculateScoreV3 (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score is: " + finalScore );
            return finalScore;
        } else {
            return -1;
        }
    }


}
