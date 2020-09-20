package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer =new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("Bob",25000.00);
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Jas","Tim@gmail.com",5000);
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getEmail());
    }
}
