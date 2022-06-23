package com.lahiru.access_controller;

public class Main {
    public static void main(String[] args) {
        Machinery machine = new Machinery("laptop", 2862, 7623);
        machine.name = "bsnjs"; // public
        machine.price = 727622; // protected can use in same package

//        machine.id = 8723628; // private can not access


        System.out.println(machine.name);
        System.out.println(machine.price);


        machine.toString(); // to access the Object.java super class ctrl + toString() click -->> redirect to the Object.java super class

    }
}
