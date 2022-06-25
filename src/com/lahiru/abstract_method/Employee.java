package com.lahiru.abstract_method;

public abstract class Employee {

    int id;

    public Employee(int id) {
        this.id = id;
    }

    // abstract method means there is no-body (no-body contained)
    abstract void workingType();
    abstract void workingHours();
    abstract void workingLocation();

}
