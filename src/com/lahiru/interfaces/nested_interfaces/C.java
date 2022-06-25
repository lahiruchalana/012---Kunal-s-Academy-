package com.lahiru.interfaces.nested_interfaces;

public class C implements A.NestedOInterface{
    @Override
    public void fun() {
        System.out.println("Its working at C class");
    }
}
