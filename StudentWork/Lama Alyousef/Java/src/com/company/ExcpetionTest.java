package com.company;
import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;

public class ExcpetionTest {

    public static void main(String[] args) {
       /*  Dog dog = new Dog("fido");
         Animal puppy = new Cat( "kitty");

         int a = 0;

         int b=25;

         int result = b/a;
        System.out.println(result); */
        ExcpetionTest test = new ExcpetionTest();

        try {
            int result = test.calculate(0, 25);
            System.out.println("Calc result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // handle exception
            //throw e;
            //throw new IllegalAccessException("Calculation is not valid");
        }
        finally {
            System.out.println("final cleanup");
        }

        System.out.println("After try/catch");

        }
        public int calculate( int a, int b){
        return b / a;
    }
}
