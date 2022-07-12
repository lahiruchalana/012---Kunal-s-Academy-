package com.lahiru.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[]  arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 4, 67, 23};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
