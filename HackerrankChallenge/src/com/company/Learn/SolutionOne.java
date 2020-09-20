package com.company.Learn;

import java.util.Scanner;

public class SolutionOne {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="";
        int i =0;
        /* Enter your code here. Print output to STDOUT. */
        for (i=A.length()-1;i>=0;i--){
            reverse = reverse + A.charAt(i);

        }

        if(reverse.equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
