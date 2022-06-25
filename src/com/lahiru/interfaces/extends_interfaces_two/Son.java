package com.lahiru.interfaces.extends_interfaces_two;

public class Son implements Dad, Mom{

    @Override
    public void feeding() {

    }

    public static void main(String[] args) {
        Son son = new Son();

        son.working();

        Dad.sleeping();
    }
}
