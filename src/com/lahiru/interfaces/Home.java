package com.lahiru.interfaces;

// class to interface inheritance -> using "implements"
public class Home implements Kitchen, Dining, BedRoom {
    @Override
    public void electricItemsIsAtOnOff() {
        System.out.println("Electric items are at off mode");
    }

    @Override
    public void potsIsAtOnOff() {
        System.out.println("All the pots are working now. Busy!!!");
    }

    // in this case we can not find, which window is open (is at kitchen, dining or bedroom)
    // in next task we can overcome that issue
    @Override
    public void windowOpen() {
        System.out.println("Yes");
    }

    @Override
    public void doorOpen() {
        System.out.println("No");
    }

    @Override
    public void windowCLose() {
        System.out.println("No");
    }

    @Override
    public void DoorClose() {
        System.out.println("Yes");
    }
}
