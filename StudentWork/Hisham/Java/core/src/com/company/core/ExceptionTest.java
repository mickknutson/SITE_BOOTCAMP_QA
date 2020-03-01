package com.company.core;


public class ExceptionTest
{
    public static void main(String[] args)
    {
       /// unchecked exceptions

        // Runtime Exception java.lang.ArithmeticException: / by zero
        try
        {
            int a = 0;
            int b = 25;
            System.out.println(b/a);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());

        }
        finally
        {
            System.out.println("Bye bye");
        }




    }
}
