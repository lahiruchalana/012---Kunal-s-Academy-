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

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone(); // this is shallow copy
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // create a deep copy
        Human twin = (Human) super.clone(); // this is also a shallow copy

        // do the deep copy part
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
