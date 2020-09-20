package com.company.Learn;

public class Car extends Vehicle{

    public  int speedIncrement;
    public int speedDecrement;

    public Car(int numberOfGears, int maxSpeed, int minSpeed,int currentSpeed, int speedIncrement, int speedDecrement) {
        super(numberOfGears, maxSpeed, minSpeed,currentSpeed);
        this.speedIncrement = speedIncrement;
        this.speedDecrement = speedDecrement;
    }

    public int getSpeedIncrement() {
        return speedIncrement;
    }

    public int getSpeedDecrement() {
        return speedDecrement;
    }

    @Override
    public void startToDrive(){
        super.startToDrive();
        System.out.println("Press the accelerator and increase the speed of the car :  " +(minSpeed+speedIncrement));
    }

    @Override
    public void stopTheCar(){
        super.stopTheCar();
         currentSpeed = speedDecrement;
        System.out.println("Decrease the speed of the car from "+currentSpeed+ " to " +(currentSpeed - speedDecrement));
    }



}
