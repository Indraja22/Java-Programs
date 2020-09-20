package com.company.Learn;

public class Vehicle {

    public int numberOfGears;
    public int maxSpeed;
    public int minSpeed;
    public int currentSpeed;

    public Vehicle(int numberOfGears, int maxSpeed, int minSpeed,int currentSpeed) {
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int getNumberOfGears() {
        System.out.println("There are " +numberOfGears + "gears.");
        return numberOfGears;
    }

    public int getMaxSpeed() {
        System.out.println("The maximum speed is : " +maxSpeed);
        return maxSpeed;
    }

    public int getMinSpeed() {
        System.out.println("The minimum speed is : " +minSpeed);
        return minSpeed;
    }

    public void startToDrive() {
        System.out.println("Start the car.");
        System.out.println("Put the car to gear number : " + numberOfGears);
    }

    public void stopTheCar(){
        System.out.println("Apply the brakes and stop the car ");
    }
}
