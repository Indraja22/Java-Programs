package com.company.Learn;

class Car{
    private boolean engine;
    private int numOfCylinders;
    private int wheels;
    private String name;

    public Car(int numOfCylinders,String name) {
        this.engine = true;
        this.numOfCylinders = numOfCylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        if(engine){
            System.out.println("Engine is ON.");
        }else {
            System.out.println("Engine is OFF.");
        }
    }

    public void accelerate(int speed){
        System.out.println("I am accelerating the car at : "+speed);
    }

    public void brake(){
        int speed = 0;
        System.out.println("Apply the brakes and stop the Car, the speed of the car now is : "+speed);
    }
}

class Audi extends Car {
    public Audi(int numOfCylinders, String name) {
        super(numOfCylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi Class : startEngine");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Audi Class : accelerate");
        System.out.println("Audi Class : accelerating at : "+speed+ " Km/Hr");
    }

    @Override
    public void brake() {
        int speed = 0;
        System.out.println("Audi class : brake");
        System.out.println("Audi class : Apply the brake, speed is :  "+speed+ " Km/Hr");
    }
}

class BMW extends Car {
    public BMW(int numOfCylinders, String name) {
        super(numOfCylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW Class : startEngine");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("BMW Class : accelerate");
        System.out.println("BMW Class : accelerating at : "+speed+ " Km/Hr");
    }

    @Override
    public void brake() {
        int speed = 0;
        System.out.println("BMW class : brake");
        System.out.println("BMW class : Apply the brake, speed is :  "+speed+ " Km/Hr");
    }
}

class Outlander extends Car {
    public Outlander(int numOfCylinders, String name) {
        super(numOfCylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Outlander Class : startEngine");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Outlander Class : accelerate");
        System.out.println("Outlander Class : accelerating at : "+speed+ " Km/Hr");
    }

    @Override
    public void brake() {
        int speed = 0;
        System.out.println("Outlander class : brake");
        System.out.println("Outlander class : Apply the brake, speed is :  "+speed+ " Km/Hr");
    }
}

 class Holden extends Car {
    public Holden(int numOfCylinders, String name) {
        super(numOfCylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden Class : startEngine");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Holden Class : accelerate");
        System.out.println("Holden Class : accelerating at : "+speed+ " Km/Hr");
    }

    @Override
    public void brake() {
        int speed = 0;
        System.out.println("Holden class : brake");
        System.out.println("Holden class : Apply the brake, speed is :  "+speed+ " Km/Hr");
    }
}

 class Ford extends Car {
    public Ford(int numOfCylinders, String name) {
        super(numOfCylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford Class : startEngine");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Ford Class : accelerate");
        System.out.println( getClass().getSimpleName()+ ": accelerating at : "+speed+ " Km/Hr");
    }

    @Override
    public void brake() {
        int speed = 0;
        System.out.println("Ford class : brake");
        System.out.println("Ford class : Apply the brake, speed is :  "+speed+ " Km/Hr");
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(9,"BASE CAR");
        car.startEngine();
        car.accelerate(80);
        car.brake();

        Audi audi = new Audi(10,"Audi Q3");
        audi.accelerate(190);
        audi.brake();
        audi.startEngine();

       Ford ford = new Ford(15,"Falcon");
       ford.accelerate(140);
       ford.brake();
       ford.startEngine();
    }


}
