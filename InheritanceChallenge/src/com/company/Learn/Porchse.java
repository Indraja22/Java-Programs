package com.company.Learn;

public class Porchse extends Car {

    public String colour;
    public String model;

    public Porchse(int numberOfGears, int maxSpeed, int minSpeed, int currentSpeed, int speedIncrement, int speedDecrement,String colour,String model) {
        super(numberOfGears, maxSpeed, minSpeed, currentSpeed, speedIncrement, speedDecrement);
    }

    public void myCar(){
        System.out.println("I have a " +colour+ " Porchse "+model);
    }

    public void longDriveInPorchse(){
        myCar();
        super.startToDrive();
        System.out.println("Back home.");
        super.stopTheCar();
    }



}
