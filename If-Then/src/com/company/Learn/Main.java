package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double add = (myFirstValue + mySecondValue)* 100.00d;
        double remainder = add % 40.00d;
        System.out.println("The Remainder is :  " +remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("The Boolean Variable is : " +isZero);
        if(!isZero)
            System.out.println("Got some remainder");
    }
}
