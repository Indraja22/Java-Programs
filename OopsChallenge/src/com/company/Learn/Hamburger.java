package com.company.Learn;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private double price;
    private String name;

    private String additionItem1;
    private String additionItem2;
    private String additionItem3;
    private String additionItem4;

    private double additionPrice1;
    private double additionPrice2;
    private double additionPrice3;
    private double additionPrice4;


    public Hamburger(String breadRollType, String meat, double price, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void addAdditionIem1(String name,double additionPrice1){
        this.additionItem1 = name;
        this.additionPrice1 = additionPrice1;
    }

    public void addAdditionIem2(String name,double additionPrice2){
        this.additionItem2 = name;
        this.additionPrice2 = additionPrice2;
    }

    public void addAdditionIem3(String name,double additionPrice3){
        this.additionItem3 = name;
        this.additionPrice3 = additionPrice3;
    }

    public void addAdditionIem4(String name,double additionPrice4){
        this.additionItem4 = name;
        this.additionPrice4 = additionPrice4;
    }

    public double yourCustomisedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println("The price of "+this.name +" with "+this.breadRollType+ " and " + this.meat + " is " +this.price);
        if(additionItem1!= null){
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added "+this.additionItem1+ " for an extra "+this.additionPrice1);
        }
        if(additionItem2!= null){
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added "+this.additionItem2+ " for an extra "+this.additionPrice2);
        }
        if(additionItem3!= null){
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added "+this.additionItem3+ " for an extra "+this.additionPrice3);
        }
        if(additionItem4!= null){
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added "+this.additionItem4+ " for an extra "+this.additionPrice4);
        }
        System.out.println("The total price of your "+this.name +" with the added extra items is  : " +hamburgerPrice);
        return hamburgerPrice;
    }

}