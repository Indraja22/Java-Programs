package com.company.Learn;

import java.util.Scanner;

public class Main {

    //private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       // int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        if(N % 2 !=0){
//            System.out.println("Weird");
//        }else if(N % 2 == 0 && N >= 2 &&  N <= 5){
//            System.out.println("Not Weird");
//        }else if(N % 2 == 0 && N >= 6 && N <= 20){
//            System.out.println("Weird");
//        }else if(N % 2 == 0 && N >20){
//            System.out.println("Not Weird");
//        }

            // Create a Scanner object to read input from stdin.
            Scanner scan = new Scanner(System.in);

            // Read a full line of input from stdin and save it to our variable, inputString.
            String inputString = scan.nextLine();

            // Close the scanner object, because we've finished reading
            // all of the input from stdin needed for this challenge.
            scan.close();

            // Print a string literal saying "Hello, World." to stdout.
            System.out.println("Hello, World.");

            // TODO: Write a line of code here that prints the contents of inputString to stdout.
            System.out.println(inputString);
        }


}
