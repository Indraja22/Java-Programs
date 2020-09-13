package com.company.Learn;

public class Wifi {

    private String theIsp;
    private String routerModel;
    private int speed;

    public Wifi(String theIsp, String routerModel, int speed) {
        this.theIsp = theIsp;
        this.routerModel = routerModel;
        this.speed = speed;
    }

    public String getTheIsp() {
        return theIsp;
    }

    public String getRouterModel() {
        return routerModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void surfTheNet(int theSpeed){
        System.out.println("I am surfing the net in my room at a speed of : " +theSpeed + " Mbps");
    }
}
