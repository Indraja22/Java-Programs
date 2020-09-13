package com.company.Learn;

public class MyRoom {

    private Windows windows;
    private Doors doors;
    private  Wifi wifi;

    public MyRoom(Windows windows, Doors doors, Wifi wifi) {
        this.windows = windows;
        this.doors = doors;
        this.wifi = wifi;
    }

    private Windows getWindows() {
        return windows;
    }

    private Doors getDoors() {
        return doors;
    }

    private Wifi getWifi() {
        return wifi;
    }

    public void relaxInTheRoom(){
        windows.openWindows();
        enjoyTheNet();
    }

    public void enjoyTheNet(){
        wifi.surfTheNet(100);
    }
}
