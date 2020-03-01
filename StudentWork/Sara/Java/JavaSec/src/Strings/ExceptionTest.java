package Strings;

import Animal.*;

public class ExceptionTest {
    public static void main(String args[]) throws Exception{
      /*  Dog dog = new Dog(null);
        Animal puppy = new Cat();*/
      ExceptionTest test = new ExceptionTest();

      try{
          int result = test.calculate(0,25);
          System.out.println("Calc result: "+ result);
      }catch (ArithmeticException e){
          System.out.println(e.getMessage());
        //  throw e;
      }finally {
          System.out.println("Done");
      }

        System.out.println("After try/catch");

    }
    public int calculate(int a , int b){
      return b/a;
    }
}
