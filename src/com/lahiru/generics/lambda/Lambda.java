package com.lahiru.generics.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(i + 1);
        }

        // Lambda functions ( -> )( one line functions)
//        list.forEach((item) -> System.out.println(item));

        Consumer<Integer> variableOne = (item) -> System.out.println(item * 4);
        list.forEach(variableOne);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        Lambda lamdaFun = new Lambda();

        System.out.println(lamdaFun.operate(9, 6, sum));
        System.out.println(lamdaFun.operate(9, 6, prod));
        System.out.println(lamdaFun.operate(9, 6, sub));

    }

//    // normal functions
//    int sum(int a, int b) {
//        return a + b;
//    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
