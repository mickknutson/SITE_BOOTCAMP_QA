package com.company.core;

public class ExceptionTests {

    public static void main(String[] args) {
        //System.out.println("Nader from the Exception class");

        ExceptionTests tests = new ExceptionTests();

        try {
            int result = tests.calculate(10, 0);

            System.out.println(result);
        }
        catch (ArithmeticException ex){
            System.out.println("Sir/Madam, Dividing by zero is not allowed. " +
                    "Unless u wanna make up your own math");
            throw ex;
        }
        finally {
            System.out.println("Clean up resources you have just" +
                    " wasted when triggering this exception");
        }
        System.out.println("resources been restored");
    }


    public int calculate(int a , int b){
        return a / b;

    }
}
