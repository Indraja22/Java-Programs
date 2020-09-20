package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(40,60);
       Windows theWindows = new Windows(5,dimensions,"North");
       Doors theDoors = new Doors(2,dimensions,true);
       Wifi mywifi = new Wifi("ACT FiberNet","Tp-Link 105Kp",150);

       MyRoom myRoom = new MyRoom(theWindows,theDoors,mywifi);
       //myRoom.enjoyTheNet();
       myRoom.relaxInTheRoom();


    }
}
