package com.lahiru.static_ex;

public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("lahiru");
        Test b = new Test("kasun");

        System.out.println(a.name);
        System.out.println(b.name);


    }
}

//class Test {
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}
