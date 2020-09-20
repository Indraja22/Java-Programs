package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Hamburger hamburger =new Hamburger("Wheat Roll","sausage",30,"Regular HamBurger");
//        hamburger.addAdditionIem1("Lettuce",5.50);
//        hamburger.addAdditionIem2("Tomato",4.00);
//        hamburger.addAdditionIem3("Onion",2.50);
//        hamburger.addAdditionIem4("cheese",6.20);
//        hamburger.yourCustomisedHamburger();

//        HealthyBurger healthyBurger = new HealthyBurger("sausage",40.00);
//        healthyBurger.addAdditionIem1("Lettuce",5.50);
//        healthyBurger.addAdditionIem2("Tomato",4.00);
//        healthyBurger.addAdditionIem3("Onion",2.50);
//        healthyBurger.addAdditionIem4("cheese",6.20);
//        healthyBurger.addAdditionIem5("ketchup",1.30);
//        healthyBurger.addAdditionIem6("falafel",10.20);
//        healthyBurger.yourCustomisedHamburger();

        Delux delux = new Delux();
        delux.yourCustomisedHamburger();
        delux.addAdditionIem1("Tomato",5.00);

    }
}
