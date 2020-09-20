package com.company.Learn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] array){
//        int[] arrayValues = getIntegers(5);
//        for (int i = 0;i<arrayValues.length;i++){
//            System.out.println("Element "+i+", typed value was "+arrayValues[i]);
//        }
        //int[] arraySortValues = sortIntegers(5);
        for (int i = 0;i<array.length;i++){
            System.out.println("Element "+i+", typed value was "+array[i]);
        }

    }

    public static int[] getIntegers(int num){
        System.out.println("Enter "+num+ " integer values : \r");
        int[] array = new int[5];
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        int a;
       int[] sortArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            sortArray[i] = array[i];
        }
        for(int i = 0;i<sortArray.length;i++){
            for (int j = i+1;j<sortArray.length;j++){
                if(sortArray[i]< sortArray[j]){
                    a= sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j]=a;
                }

//                System.out.println(sortArray[j]);
            }
           // System.out.println(sortArray[i]);
            System.out.println("Descending : " +sortArray[i]);
        }

        return sortArray;
    }


    public static void main(String[] args) {
        int[] a = getIntegers(5);
        printArray(a);
        sortIntegers(a);


        }


}
