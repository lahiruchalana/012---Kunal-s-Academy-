package com.lahiru.static_ex;

public class Human {
    String name;
    int age;
    int salary;
    int hno;
    // property which is common or independent or unrelated to the object is declared with static
    static long population;

    public Human(String name, int age, int salary, int hno) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hno = hno;
        Human.population += 1;
    }
}
