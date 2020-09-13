package com.company.Learn;

public class Main {

    public static void main(String[] args) {
        // write your code here
      int highScore = calculateScore(true, 500, 600, 10);
        System.out.println("The final score is : " +highScore);
        highScore =  calculateScore(true, 900, 400, 15);
        System.out.println("The final score is : " +highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
           // System.out.println("Your Final Score was : " + finalScore);
            return finalScore;
        }

        return -1;


    }
}
