package com.company.Learn;

public class Delux extends Hamburger {

    public Delux() {
        super("White", "Sausage and bacon", 60.00, "Deluxe Burger");
        super.addAdditionIem1("Chips",20);
        super.addAdditionIem2("Drink",15.00);
    }

    //This is done to restrict access of Delux object, so that it cannot access the below methods from Hamburger class
    @Override
    public void addAdditionIem1(String name, double additionPrice1) {
        System.out.println("Cannot add  additional items to Deluxe Burger");
    }

    @Override
    public void addAdditionIem2(String name, double additionPrice2) {
        System.out.println("Cannot add  additional items to Deluxe Burger");
    }

    @Override
    public void addAdditionIem3(String name, double additionPrice3) {
        System.out.println("Cannot add  additional items to Deluxe Burger");
    }

    @Override
    public void addAdditionIem4(String name, double additionPrice4) {
        System.out.println("Cannot add  additional items to Deluxe Burger");
    }
}
