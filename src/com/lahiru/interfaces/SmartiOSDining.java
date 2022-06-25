package com.lahiru.interfaces;

// single inheritance, class to interface (not multiple inheritance)
public class SmartiOSDining implements Dining {
    @Override
    public void electricItemsIsAtOnOff() {
        System.out.println("iOS Smart Dining -> all electric items are automated");
    }

    @Override
    public void windowOpen() {
        System.out.println("iOS Smart Dining -> all windows are automated");
    }

    @Override
    public void doorOpen() {

    }

    @Override
    public void windowCLose() {

    }

    @Override
    public void DoorClose() {

    }
}
