package com.company.Learn;

public class Test {
    public static void main(String[] args) {
        int playerScore = 50;
        String playerName = "Tim";
        int score = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, score);

        playerName = "Jane";
        playerScore = 900;
        score = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, score);

        playerName = "Jim";
        playerScore = 350;
        score = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, score);

        playerName = "Chris";
        playerScore = 500;
        score = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, score);

        playerName = "Paul";
        playerScore = 1000;
        score = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, score);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
