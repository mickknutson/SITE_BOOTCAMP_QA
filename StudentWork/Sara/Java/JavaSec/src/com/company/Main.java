package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private String anInstanceVariable = "instance";
    public static String aStaticVariable = "static";


    /*

     */


    // Method Block of code:
    public static void main(String[] args) {

        String aLocalVariable = "local";

        int variableA = 1;

        int i = 42;
        Integer wrap=i;
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        System.out.println(integers.get(0));


        // write your code here
        System.out.println("variableA: " + variableA);

        System.out.println("Hello Sara!");
        System.out.println("local: " + aLocalVariable);

//        System.out.println("instance: " + anInstanceVariable);

        System.out.println("Static: " + aStaticVariable);
        int number =1 ;

       /* String output = (number %2 = 0) ? "even number" : "odd number";
        System.out.println("output :" + output);

        System.out.println("number :" + number);
        System.out.println("number :" + ++number);
        System.out.println("number :" + number++);
        System.out.println("number :" + --number);
        System.out.println("number :" + number--);*/


    } // end main() BLOCK

} // The End...

