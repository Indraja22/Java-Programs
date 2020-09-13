package com.company.Learn;

public class Main {

    public static void main(String[] args) {
        // write your code here
        calculateScore(true, 500, 600, 10);
        calculateScore(true, 900, 400, 15);
    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your Final Score was : " + finalScore);
            return finalScore;
        }

        return -1;


    }
}
