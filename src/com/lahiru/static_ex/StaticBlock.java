package com.lahiru.static_ex;

public class StaticBlock {
    static int a = 7;
    static int b;

    public static void main(String[] args) {
        System.out.println("value a = " + a + " Value b = " + b);

        StaticBlock.a += 3;

        System.out.println("value a = " + a + " Value b = " + b);

    }

    static {
        System.out.println("This is a static block");
        b = a * 5;
    }

}
