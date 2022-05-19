package com.lahiru.static_ex;

public class Main {
    public static void main(String[] args) {
        Human lahiru = new Human("LC", 22, 20000, 24567);
        Human kasun = new Human("Kasun", 22, 25500, 25867);
        Human isuru = new Human("Isuru", 22, 500000, 23456);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Main something = new Main();
        something.greeting();
        something.nonStaticFunction();

        staticFunction();
    }

    // static function is not relating to an object/ instance
    static void staticFunction() {
        System.out.println("This is an static function");

//        nonStaticFunction(); // inside a static function you can not run a non-static function
        // because non-static function is relating to an object
        // so, it should have an object to run byu static function do not n eed an object
        // so non-static function can not run inside a static function

        // but you can access to a non-static stuff (function or a variable) using an object
        Main some = new Main();
        some.nonStaticFunction();

        Main some2 = new Main();
        some2.greeting();

    }

    // non-static function belongs or relate to an object or an instance // (instance of a class and object are same)
    void nonStaticFunction() {
        System.out.println("This is a non-static function");
        greeting(); // can run a non-static function inside a static function
        // because the nonStaticFunction() will create an object(because non-static function belong to an object) and
        // that object will refer to the greeting() function, so it also belongs to a object
    }

    void greeting() {
        System.out.println("Welcome");
    }
}
