package com.baselogic.core;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Puppy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog("DeeOhGee");
        Puppy puppy = new Puppy("pup");
        Cat cat = new Cat("KITTY");

        animal.eat();
        dog.talk();
        dog.talk("woof");



      // dog.talk();
     // dog.eat();
      //cat.eat();
     //   puppy.eat();
     /*
        System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(puppy.getName());
*/
        //  System.out.println("Hello World");
      /*
        int number = 1;
        String output = (number %2 == 0) ? "even number" : "odd number";
        System.out.println("output " + output);
        System.out.println("output " + number);
        System.out.println("output " + ++number);
        System.out.println("output " + number++);
        System.out.println("output " + number--);
        System.out.println("output " + --number);
        */


    }
}
