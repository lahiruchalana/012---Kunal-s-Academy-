package com.lahiru.abstract_method;

public class Manager extends Employee{



    @Override
    public void workingType() {
        System.out.println("I am a manager");
    }

    @Override
    public void workingHours() {
        System.out.println("8:00AM - 6:00PM");
    }

    @Override
    public void workingLocation() {
        System.out.println("location is Main Branch");
    }
}
