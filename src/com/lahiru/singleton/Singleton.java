package com.lahiru.singleton;

public class Singleton {
    int age;
    String name;
    int salary;

    private Singleton() {
        this.age = 20;
        this.name = "kasun";
        this.salary = 34000;
    }

    private static Singleton singletonObject;

    public static  Singleton initiateSingletonObject() {
            if (singletonObject == null) {
                singletonObject = new Singleton();
            }

            return singletonObject;
    }


}
