package com.lahiru.static_ex;

public class Main {
    public static void main(String[] args) {
        Human lahiru = new Human("LC", 22, 20000, 24567);
        Human kasun = new Human("Kasun", 22, 25500, 25867);
        Human isuru = new Human("Isuru", 22, 500000, 23456);

        System.out.println(lahiru.population);
        System.out.println(kasun.population);
    }

}
