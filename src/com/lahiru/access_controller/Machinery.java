package com.lahiru.access_controller;

public class Machinery {
    public String name;
    private int id;
    protected int price;

    public Machinery(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

//    // static methods are not override
//    public static void running(){
//        System.out.println("machinery running");
//    }

    // Encapsulation here -->> data hiding with "private" key and getters and setters to change those id data
    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
