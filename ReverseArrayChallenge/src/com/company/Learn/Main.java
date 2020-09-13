package com.company.Learn;

public class Main {

    private void reverse(int[] array){
        int a;
        for (int i = 0; i< array.length; i++){
            for (int j = i+1;j< array.length;j++){
                a  = array[i];
                array[i] = array[j];
                array[j] = a;
            }
        }
        System.out.println(" Its Reverse : " );
        for (int k =0; k<array.length;k++){
           // int my[] = array;
            System.out.println(array[k]);
        }

    }

    private void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(" Its Reverse : ");
        for (int k = 0; k < array.length; k++) {
            // int my[] = array;
            System.out.println(array[k]);
        }
    }


    public static void main(String[] args) {
	// write your code here
        int[] myArray = new int[]{1,2,3,4,5};
        Main main = new Main();
        System.out.println("Original Array : ");
        for (int i = 0 ;i<myArray.length;i++) {
            System.out.println(myArray[i]);
        }
       // main.reverse(myArray);
        main.reverseArray(myArray);
    }
}
