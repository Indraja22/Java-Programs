package com.company.Learn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(54);
        for (int i = 0;i<intArr.size();i++){
            int getArr = intArr.get(i);
            System.out.println(getArr);
        }
    }
}
