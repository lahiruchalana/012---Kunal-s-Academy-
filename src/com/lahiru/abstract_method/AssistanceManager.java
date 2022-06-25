package com.lahiru.abstract_method;

public class AssistanceManager extends Employee{

    public AssistanceManager(int id) {
        super(id);
    }

//    // can not hold a function without a body in other classes (non-abstract classes)
//    public void someFun();

    @Override
    void workingType() {
        System.out.println("I am a assistance manager");
    }

    @Override
    void workingHours() {
        System.out.println("8:30AM - 5:30PM");
    }

    @Override
    void workingLocation() {
        System.out.println("Colombo");
    }
}
