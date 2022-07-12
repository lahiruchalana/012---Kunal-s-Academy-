package com.lahiru.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human lahiru = new Human(25, "Lahiru");

        Human twin = (Human) lahiru.clone();

        System.out.println(Arrays.toString(lahiru.arr));

        twin.arr[0] = 100;

        System.out.println(twin.age + ", " + twin.name);
        System.out.println(Arrays.toString(lahiru.arr));
    }
}
