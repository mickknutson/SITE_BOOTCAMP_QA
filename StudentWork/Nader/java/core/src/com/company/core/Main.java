package com.company.core;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    private String anInstanceVariable;
    public static String name = "Nader Althubaity";

    public static void main(String[] args) {
        // write your code here
        basic();
        //the next section
    }

    private static void basic() {
        int number = 1;
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(--number);
        System.out.println(number--);


        //This is the casting example given in class
            Animal animal = new Animal();
            Animal cat = new Cat();
            Animal dog = new Dog();
            animal.Eat();
            cat.Eat();

        ((Cat)cat).Talk(); // This is known as down casting Animal --> Cat
        ((Dog)dog).Talk(); // (Type of) Animal --> (Type of)Dog
        }
}