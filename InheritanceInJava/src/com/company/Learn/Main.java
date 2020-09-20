package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Tommy",8,20,2,4,1,20,"Silky");
       // dog.eat();
       // dog.run();
        //dog.walk();
        //dog.move(20);

        Fish fish = new Fish("Salmon",40,2,5,2,2);
        fish.swim(20);
    }
}
