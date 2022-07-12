package com.lahiru.exeption_handling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
//            divide(a, b);
            // mimicing
//            throw new Exception("mimicing exception");
            String name = "lahiru";
            if (name.equals("lahiru")) {
                throw new MyException("new exception from lahiru");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
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
