package com.company.Learn;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int teeth,int tail,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs  = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {

        chew();
        System.out.println("Dog.eat() called");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called.");
    }


    @Override
    public void move(int speed){
        System.out.println("Dog.move() was called.");
        moveLegs(speed);
        super.move(10);
    }
}
