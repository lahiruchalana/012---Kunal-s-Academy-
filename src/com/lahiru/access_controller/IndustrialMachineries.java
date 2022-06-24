package com.lahiru.access_controller;

public class IndustrialMachineries extends Machinery {

    public IndustrialMachineries(String name, int id, int price) {
        super(name, id, price);
    }

//    // static methods are not override
//    @Override
//    public void running(){
//
//    }

    public static void main(String[] args) {
        IndustrialMachineries indmchn = new IndustrialMachineries("sh", 83232, 24321424);
        indmchn.price = 2323; // Protected is working also in subclass

        System.out.println(indmchn.price);

        Machinery washingmachine = new Machinery("washingmachine", 2324, 4444);
        washingmachine.price = 2222; // same package so can access by protected mode
    }
}
