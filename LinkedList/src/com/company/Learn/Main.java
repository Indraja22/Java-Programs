package com.company.Learn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Indraja",25.16);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(15.32);
        anotherCustomer.setName("Tim");
        System.out.println("Balance for customer " +customer.getName() + " is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for (int i=0;i<intList.size();i++){
            System.out.println(i +": "+intList.get(i));
        }
        intList.add(1,2);

        for (int i=0;i<intList.size();i++){
            System.out.println(i +": "+intList.get(i));
        }
    }
}
