package com.company.Learn;

public class Doors {
    private int numberOfDoors;
    private Dimensions dimensions;
    private boolean isOpen;

    public Doors(int numberOfDoors, Dimensions dimensions, boolean isOpen) {
        this.numberOfDoors = numberOfDoors;
        this.dimensions = dimensions;
        this.isOpen = isOpen;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void dimensionsOfMyDoor(int h,int w){
        System.out.println("The doors have a height of : "+h+ " and width of : " +w);
    }

}
