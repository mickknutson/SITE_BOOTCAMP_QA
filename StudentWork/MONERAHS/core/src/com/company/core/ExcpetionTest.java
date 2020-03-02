package com.company.core;

public class ExcpetionTest {

    public static void main(String[] args) throws ArithmeticException {
        ExcpetionTest test = new ExcpetionTest();
        try {
            int a = 25;
            int b = 0;
            int result = a / b;
            System.out.println("Calc Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("final cleanup");
        }
        System.out.println("After try/catch block");

    }


}
