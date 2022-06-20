package com.lahiru.polymorphism;

public class MethodOverloading {

    public void getData(int a, int b) {
        System.out.println("int values");
    }

    public void getData(String a, String b) {
        System.out.println("string values");
    }

    public void getData(int a, String b) {
        System.out.println("int and string both data types");
    }

    public void getData(int c, float wdb) {
        System.out.println("int and float both data types");
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        methodOverloading.getData(223,34);
        methodOverloading.getData(232, 78.7f);
        methodOverloading.getData("sgvstdy", "dghvsgdy");
        methodOverloading.getData(23, "dghwsbv");
    }
}
