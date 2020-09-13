package com.company.Learn;

public class HealthyBurger extends Hamburger{

    private String additionItem5;
    private String additionItem6;
    private double additionPrice5;
    private double additionPrice6;

   private String breadRollType;


    public HealthyBurger(String meat, double price) {
        super("Brown rye",meat, price, "Healthy Burger");

    }
    @Override
    public double yourCustomisedHamburger(){
        double hamburgerPrice = super.yourCustomisedHamburger();
        System.out.println("The price of "+ getName() +" with "+getBreadRollType()+ " and " + getMeat() + " is " +getPrice());
        if(additionItem5!= null){
            hamburgerPrice += this.additionPrice5;
            System.out.println("Added "+this.additionItem5+ " for an extra "+this.additionPrice5);
        }
        if(additionItem6!= null){
            hamburgerPrice += this.additionPrice6;
            System.out.println("Added "+this.additionItem6+ " for an extra "+this.additionPrice6);
        }

        System.out.println("The total price of your HamBurger with the added extra items is  : " +hamburgerPrice);
        return hamburgerPrice;
    }

    public void addAdditionIem5(String name,double additionPrice5){
        this.additionItem5 = name;
        this.additionPrice5 = additionPrice5;
    }

    public void addAdditionIem6(String name,double additionPrice6){
        this.additionItem6 = name;
        this.additionPrice6 = additionPrice6;
    }



}
