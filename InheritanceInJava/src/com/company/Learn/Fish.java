package com.company.Learn;

public class Fish extends Animal {

    private int gill;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gill, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gill = gill;
        this.fins = fins;
        this.eyes = eyes;
    }

    public int getGill() {
        return gill;
    }

    public int getFins() {
        return fins;
    }

    public int getEyes() {
        return eyes;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(60);
    }

    private void moveBackFin(){

    }
}
