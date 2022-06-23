package com.lahiru.object_class_property;

import java.util.Objects;

public class Vehicle {
    private int id;
    private int price;
    private String name;

    public Vehicle(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    // this is an Override for equal method in Object.java super class
    // Object.java is the super class for every class in java
    // so every java class is a subclass of Object class
    // example for equal method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && price == vehicle.price && Objects.equals(name, vehicle.name);
    }

    // Override happened because it's a method of super class which is Object.java class
    @Override
    public int hashCode() {
        return Objects.hash(id, price, name);
    }

    // use this to test
    @Override
    public String toString() {
        return name;
    }

    public Vehicle() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(876, 888, "audi");
        System.out.println(vehicle.toString()); // Override toString method
        System.out.println(vehicle.hashCode());
    }
}
