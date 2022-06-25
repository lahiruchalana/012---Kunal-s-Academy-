package com.lahiru.abstract_method;

public class Manager extends Employee{


    public Manager(int id) {
        super(id);
    }

    // static abstract methods are not available -->> because static do not need a object but
    // abstract method need a object and should be override
    static void staticMethod() {
        System.out.println("I am a static method in the Manager class");
    }

    // normal methods also available in abstract class
    void normalMethod() {
        System.out.println("I am a normal method in the Manager class");
    }

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
