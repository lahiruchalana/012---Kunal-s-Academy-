package com.lahiru.enum_sample;

public class Main {
    enum Week implements interface1 {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // enum is public, static and final stuff
        // data type is Week in this example
        // these are enum constants


        Week() {
            System.out.println("this is the constructor" + this);
        }

        @Override
        public void hellow() {
            System.out.println("hellow");
        }
    }

    public static void main(String[] args) {
        Week day1;
        day1 = Week.Friday; // like new Week();
        day1.hellow();


//        System.out.println(day1);

//        for (Week days : Week.values()) {
//            System.out.println(days);
//        }
    }
}
