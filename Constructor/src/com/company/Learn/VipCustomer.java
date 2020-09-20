package com.company.Learn;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    //
    public VipCustomer() {

        this("Default Name", "default@gmail.com", 2000);
    }

    //Should paas 2 values that it receives and default the 3rd
    public VipCustomer(String name, double creditLimit) {
        this(name, "Indraja@gmail.com", creditLimit);

    }

    //Should save all the fields
    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }
}
