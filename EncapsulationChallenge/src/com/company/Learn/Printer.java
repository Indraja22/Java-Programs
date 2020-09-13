package com.company.Learn;

public class Printer {

    private int tonerLevel = 100;
    private int numOfPagesInPrinter = 1000;
    private boolean isDuplex;

    public Printer(int tonerLevel,int numOfPagesInPrinter,boolean isDuplex){
        if(tonerLevel> 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        if(numOfPagesInPrinter > 0 && numOfPagesInPrinter < 1000) {
            this.numOfPagesInPrinter = numOfPagesInPrinter;
        }
        this.isDuplex = isDuplex;
    }

    public void fillUpTheTonner(){
        int refillAmt;
         if(this.tonerLevel >= 100){
             System.out.println("Toner is filled to maximum capacity." +this.tonerLevel);

         }else if(this.tonerLevel > 0){
             refillAmt = 100 - this.tonerLevel;
             this.tonerLevel = this.tonerLevel + refillAmt;
             System.out.println("Now the tonerLevel after adding a refill of "+refillAmt+ " tones is : "+this.tonerLevel);
         }

    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.numOfPagesInPrinter += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages(){
        return numOfPagesInPrinter;
    }
}
