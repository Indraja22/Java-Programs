package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Printer printer = new Printer(80,1500,true);
        Printer printer1 = new Printer(500,50,false);
//        System.out.println(printer.getNumberOfPages());
//        System.out.println(printer.getTonerLevel());
       // printer.printPages();
        printer.fillUpTheTonner();
        printer.getNumberOfPages();
        printer.getTonerLevel();
        System.out.println(printer.printPages(4));
        printer1.fillUpTheTonner();
        printer1.getNumberOfPages();
        printer1.getTonerLevel();
        System.out.println(printer.printPages(2));


    }
}
