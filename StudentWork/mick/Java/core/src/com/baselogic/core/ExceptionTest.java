package com.baselogic.core;

public class ExceptionTest {



    public static void main(String[] args)
    throws ArithmeticException{

        ExceptionTest test = new ExceptionTest();

        try{
            // attempt to exe code that can fail:
            int result = test.calculate(0, 25);

            System.out.println("Calc result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            // handle exception
            throw new IllegalArgumentException("Calculation is not valid");
        }
        finally {
            System.out.println("final cleanup");
        }

        System.out.println("after try/catch");
        System.out.println("** No results found **");



    }

    public int calculate(int a, int b){
        return b / a;
    }
}
