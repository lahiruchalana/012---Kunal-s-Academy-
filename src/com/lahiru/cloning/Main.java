package com.lahiru.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human lahiru = new Human(25, "Lahiru");

        Human twin = (Human) lahiru.clone();

        System.out.println(twin.age + ", " + twin.name);
    }
}
