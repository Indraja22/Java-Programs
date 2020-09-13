package com.company.Learn;

public class DigitSum {

    public static int sumDigits(int number){
        int sum = 0;
        int unitsPlace =0;
        int tensPlace = 0;
        if((number < 10 )||(number < 0)){
            return -1;
        }
        while (number !=0){
            sum = sum + number%10;
            number = number/10;

        }
        return sum;
    }

    public static void main(String[] args) {
       int re = sumDigits(332123);
        System.out.println(re);
    }
}
