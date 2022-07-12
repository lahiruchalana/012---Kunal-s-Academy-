package com.lahiru.exeption_handling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("'finally' always executed");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("there is a dividing using zero value");
        }

        return a / b;
    }
}
