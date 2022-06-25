package com.lahiru.interfaces;

public interface BedRoom {

    // interface used for multiple inheritance purpose

    // Interface attributes are by default public ,static and final.
    // An interface cannot contain a constructor (as it cannot be used to create objects)

    // interface cannot be used to create objects
    // by default public ,static and final.
    int numberOfWindows = 5;
    int numberOfDoors = 1;

    // in interface we can create methods without a body (do not need to add "abstract" key word)
    void windowOpen();
    void doorOpen();
    void windowCLose();
    void DoorClose();

}
