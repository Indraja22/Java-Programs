package com.company.Learn;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private int[] readIntegers(int count){
        System.out.println("User has entered the array length as : " +count);
        int[] myArray = new int[count];
        System.out.println("Enter "+count+ " Integers : \r");

        for(int i = 0; i< myArray.length;i++){
           myArray[i] = scanner.nextInt();

        }
        System.out.println("The user entered numbers are : ");

        for (int i = 0; i< myArray.length;i++){
            System.out.println(myArray[i]);

        }
        return myArray;
    }

    private int findMin(int[] array){
        int a = 0;
       for(int i = 0; i< array.length; i++){
           for(int j = 0; j< array.length; j++){
               if(array[i] > array[j]){
                   a = array[i];
                   array[i] = array[j];
                   array[j] = a;
               }
           }
       }
       return array[array.length - 1];
    }

    private int findMinimumValue(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            int value = array[i];

            if(min > value){
                min = value;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Enter the desired length of array : ");
        int getCount = scanner.nextInt();
       int[] newArray =  main.readIntegers(getCount);
      int minElement =  main.findMin(newArray);
        System.out.println("The value of minimum element in the user entered array is : "+minElement);
        int minimumValue = main.findMinimumValue(newArray);
        System.out.println(minimumValue);

    }
}
