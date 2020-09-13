package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Maximum Float Value : " +myMaxFloatValue);
        System.out.println("Minimum Float Value : " +myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Maximum Float Value : " +myMaxDoubleValue);
        System.out.println("Minimum Float Value : " +myMinDoubleValue);

        float myFloatValue = (float) 5.25;
        System.out.println(myFloatValue);

        float myNewFloat = 6f;
        double myNewDouble = 6d;

        System.out.println(myNewFloat);
        System.out.println(myNewDouble);

        float myFloat = 5f/3f;
        double myDouble = 5d/3d;
        System.out.println(myFloat);
        System.out.println(myDouble);

    }
}
