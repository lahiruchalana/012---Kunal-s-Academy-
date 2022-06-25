package com.lahiru.abstract_method;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager(134);
        manager1.workingType();
        manager1.workingHours();
        manager1.workingLocation();

        // normal method
        manager1.normalMethod();

        // static method
        Manager.staticMethod();

        AssistanceManager assistanceManager1 = new AssistanceManager(123);
        assistanceManager1.workingType();
        assistanceManager1.workingHours();
        assistanceManager1.workingLocation();

    }
}
