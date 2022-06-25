package com.lahiru.interfaces.nested_interfaces;

public class A {
    // nested interface
    public interface NestedOInterface {
        void fun();
    }
}

class B implements A.NestedOInterface {

    @Override
    public void fun() {
        System.out.println("working function!!!");
    }
}
