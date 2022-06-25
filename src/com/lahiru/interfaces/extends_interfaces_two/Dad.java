package com.lahiru.interfaces.extends_interfaces_two;

public interface Dad {

    // default methods in interface
    default void working() {
        System.out.println("father working as a teacher");
    }

    // static methods in interface
    static void sleeping() {
        System.out.println("Dad Sleeping 6 hours");
    }
}
