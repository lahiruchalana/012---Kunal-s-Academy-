package com.lahiru.polymorphism;

public class FinanceMinistry {

     public void mainTask() {
         System.out.println("Main task is to manage finance in the state");
     }


//     If you are using the "final" or "static" key words in here for method then the @Override will not be worked
//    as a example --->>
//    public final void mainTask() {
//        System.out.println("Main task is to manage finance in the state");
//    }

//    public static void mainTask() {
//        System.out.println("Main task is to manage finance in the state");
//    }


//    also if you are using final for your super class then the other sub class can not create
//    example ---->>
//     public final class FinanceMinistry {
//      content
//     }

}
