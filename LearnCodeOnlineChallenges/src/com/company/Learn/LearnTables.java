package com.company.Learn;

import java.util.Scanner;

public class LearnTables {
    int number;
    LearnTables(int number){
        this.number = number;
    }
    private void multiplicationTable(int number){
        for(int i =1;i<=10;i++){
            int result = i * number;
            System.out.println(number+ " X "+i+ " = "+result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        LearnTables learnTables = new LearnTables(n);
        learnTables.multiplicationTable(n);

    }

}
