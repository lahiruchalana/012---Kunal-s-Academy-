package com.lahiru.interfaces;

public class RunSmartHome {
    public static void main(String[] args) {
        Home home1 = new Home();

        home1.electricItemsIsAtOnOff();
        home1.potsIsAtOnOff();
        home1.windowOpen();
        home1.DoorClose();

        BedRoom home2 = new Home();

//        // reference variable home2 created at BedRoom Interface but there is no such an
//        // attribute calls numberOfAllWindows -> that attribute is available at Home Class
//        // if you need to access numberOfAllWindows attribute you should create your home2 reference variable using Home Class
//        home2.numberOfAllWindows;

        // static attribute at BedRoom interface -> no need of object
        int numberOfDoors = BedRoom.numberOfDoors;
        System.out.println(numberOfDoors);
    }
}
