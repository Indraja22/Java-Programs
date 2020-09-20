package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2020b","dell","200V AC",dimensions);

        Monitor monitor = new Monitor("27inch beast","HP",27,new Resolution(2540,1458));
        Motherboard motherboard = new Motherboard("8J-855","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();
        thePC.drawLogo();

    }
}
