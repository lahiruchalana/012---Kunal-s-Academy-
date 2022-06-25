package com.lahiru.interfaces;

// single inheritance, class to interface (not multiple inheritance)
public class NormalKitchen implements Kitchen{
    @Override
    public void potsIsAtOnOff() {
        System.out.println("Normal Kitchen -> off mode");
    }

    @Override
    public void windowOpen() {
        System.out.println("Normal Kirchen -> closed all");
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
