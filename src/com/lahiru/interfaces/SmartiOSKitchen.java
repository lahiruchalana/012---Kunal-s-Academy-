package com.lahiru.interfaces;

// single inheritance, class to interface (not multiple inheritance)
public class SmartiOSKitchen implements Kitchen{
    @Override
    public void potsIsAtOnOff() {
        System.out.println("iOS Smart Kitchen -> all pots are automated");
    }

    @Override
    public void windowOpen() {
        System.out.println("iOS Smart Kitchen -> all windows are automated");
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
