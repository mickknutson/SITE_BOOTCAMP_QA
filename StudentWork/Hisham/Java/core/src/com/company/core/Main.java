package com.company.core;
import com.company.core.animal.Animal;

import java.util.*;
public class Main {


    private String anInstanceVar = "instance";
    public static String aStaticVar = "Static";

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal wolf = new Animal("wolf");
        animal.eat();
        wolf.eat();
        System.out.println("Hello World");

        basic();


    }

    private static void basic() {
        int number = 1;
        String output = (number%2 == 0 ) ? "even number" : "odd number" ;
        System.out.println("output is : "+ output);

        System.out.println("number is : "+ number);
        System.out.println("number is : "+ ++number);
        System.out.println("number is : "+ number++);
        System.out.println("number is : "+ number--);
        System.out.println("number is : "+ --number);
    }
}
