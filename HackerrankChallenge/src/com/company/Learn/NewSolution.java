package com.company.Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewSolution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
//        ArrayList<String> lexo = new ArrayList<String>();
        String currStr = s.substring(0, k);
        smallest = currStr;
        largest = currStr;

        // Consider all remaining substrings. We consider
        // every substring ending with index i.
        for (int i = k; i < s.length(); i++) {
            currStr = currStr.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currStr) < 0)
                largest = currStr;
            if (smallest.compareTo(currStr) > 0)
                smallest = currStr;
        }
        //lexo.add(sub);
                //System.out.println(sub);




//        for (int j = 0; j < lexo.size(); j++) {
//
//            Collections.sort(lexo);
//        }
//        smallest = lexo.get(0);
//        largest = lexo.get(lexo.size() - 1);


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
