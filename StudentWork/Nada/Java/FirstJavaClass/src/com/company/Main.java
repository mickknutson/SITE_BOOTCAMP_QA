package com.company;

import Animal.Animal;
import Animal.Dog;
import Animal.Puppy;
import Animal.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private String anInstanceVariable = "instance";
    public static String aStaticVariable = "static";


    // Method Block of code:
    public static void main(String[] args) {

        //Animal animal = new Animal();
        Dog dog = new Dog("DeeOhGee");
        Cat cat = new Cat("Kitty");


       // animal.eat();
        cat.talk("meow!!");
        dog.talk("Woof");

        List<Animal> things = new ArrayList();







    } // end main() BLOCK

} // The End...
