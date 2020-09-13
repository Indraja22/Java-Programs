package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Primitive types -->
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
      String myString = "This is a String";
        System.out.println("myString is equal to : " +myString);
       myString = myString + "\u00A9 2019";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 105.78d;
        lastString = lastString + 105.78d;
        System.out.println(lastString);
    }
}
