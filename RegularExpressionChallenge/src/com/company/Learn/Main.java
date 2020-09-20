package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //CHALLENGE_1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches(".*"));
        System.out.println(challenge1.matches("I want a bike."));

        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches("I want a \\w+."));
        System.out.println(challenge1.matches("I want a \\w+."));
    }
}
