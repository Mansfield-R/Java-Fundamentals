package com.section4;

public class displayHighScorePosition {

    public static void main(String[] args) {

        displayHighScore("Benny", calculateHighScorePosition(400));

    }

    public static void displayHighScore (String playerName, int scoreBoardPosition) {
        System.out.println(playerName +
                "Managed to get into position: " +
                scoreBoardPosition +
                " on the high score table.");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

}
