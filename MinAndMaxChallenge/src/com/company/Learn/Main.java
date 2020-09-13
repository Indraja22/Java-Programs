package com.company.Learn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean first = true;
        while (true){
            System.out.println("Enter number :");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                 num = scanner.nextInt();

//                if(first){
////                    first =false;
////                    min =num;
////                    max =num;
////                }
                if(num > max){
                    max = num;
                }
                if(num < min) {
                    min = num;
                }
            }else {

                break;
            }
            scanner.nextLine();//handle input
        }
        System.out.println("min= "+min + ", max= "+max);
        scanner.close();
    }
}
