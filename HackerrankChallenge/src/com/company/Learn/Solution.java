package com.company.Learn;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Sum the lengths of  A and  B.
        System.out.println(A.length() + B.length());
        //Determine if  A is lexicographically larger than B  (i.e.: does A come before B in the dictionary?)
        int c = A.compareTo(B);
        if(c > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        //Capitalize the first letter in  and  and print them on a single line, separated by a space.

        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0)) + " " + B.replace(B.charAt(0), B.toUpperCase().charAt(0)));
    }
}




