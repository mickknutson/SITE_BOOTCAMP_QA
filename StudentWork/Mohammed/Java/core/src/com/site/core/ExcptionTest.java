package com.site.core;

import com.site.core.animal.Animal;
import com.site.core.animal.Dog;

public class ExcptionTest {

    public int calculate (int a , int b ) {
        return b / a;
    }

    public static void main(String[] args) {

        ExcptionTest test = new ExcptionTest();

        try
        {
            int result = test.calculate(0, 35);
            System.out.println("Calc : " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println(" Final CleanUp");
        }

        System.out.println(" after try/catch/finally blocks !");

    }
}
