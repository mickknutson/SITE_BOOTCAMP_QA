package com.company.core;
import com.company.core.animal.Animal;
import com.company.core.animal.Cat;
import com.company.core.animal.Dog;
import com.company.core.animal.Puppy;

import java.util.*;
public class Main {


    private String anInstanceVar = "instance";
    public static String aStaticVar = "Static";

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal wolf = new Animal("wolf");
        Dog dog = new Dog("zippy");
        Puppy pup = new Puppy("pup");
        Cat cat = new Cat("Cimba");



        animal.eat();
        wolf.eat();
        dog.eat();
        pup.eat();
        cat.eat();

        System.out.println(dog.getName());

//        basic();


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
