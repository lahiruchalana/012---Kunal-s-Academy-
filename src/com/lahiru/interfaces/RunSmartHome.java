package com.lahiru.interfaces;

public class RunSmartHome {
    public static void main(String[] args) {
        Home home1 = new Home();

        home1.electricItemsIsAtOnOff();
        home1.potsIsAtOnOff();
        home1.windowOpen();
        home1.DoorClose();
    }
}
