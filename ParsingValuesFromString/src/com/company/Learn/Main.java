package com.company.Learn;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2020.235";
        System.out.println("numberAsString : " +numberAsString);
//        int number = Integer.parseInt(numberAsString);
//        System.out.println("number = "+number);

        numberAsString +=1;
        System.out.println("numberAsString : " +numberAsString);
//        number +=1;
//        System.out.println("number = "+number);

        double num = Double.parseDouble(numberAsString);
        System.out.println("num = " +num);
    }
}
