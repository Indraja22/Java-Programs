package com.company.Learn;

public class Windows {

    private int numberOfWindows;
    private Dimensions dimensions;
    private String directionOfWindow;

    public Windows(int numberOfWindows, Dimensions dimensions, String directionOfWindow) {
        this.numberOfWindows = numberOfWindows;
        this.dimensions = dimensions;
        this.directionOfWindow = directionOfWindow;
    }

    public void openWindows(){
        System.out.println("Open the Windows and the let the fresh air come inside.");
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getDirectionOfWindow() {
        return directionOfWindow;
    }
}
