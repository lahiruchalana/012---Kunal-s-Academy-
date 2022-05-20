package com.lahiru.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton object = Singleton.initiateSingletonObject();
        Singleton object2 = Singleton.initiateSingletonObject();
        Singleton object3 = Singleton.initiateSingletonObject();

        System.out.println(object.name);
        System.out.println(object2.age);
        System.out.println(object3.salary);
    }
}
