package com.company.core;

import com.company.core.animal.Animal;
import com.company.core.animal.Cat;
import com.company.core.animal.Dog;
import com.company.core.animal.Puppy;

public class Main {

    private String anInstanceVariable;
    public static String name = "Nader Althubaity";

    public static void main(String[] args) {
        // write your code here
        //call the basic function -- //basic();
        //the next section

        //This is the casting example given in class
        //Animal animal = new Animal("Pear");
        //Animal cat = new Cat();
        Dog dog = new Dog("BeeOHGee");
        Puppy puppy = new Puppy("The Puppy");
        //animal.Eat();
        //cat.Eat();
//
//        ((Cat)cat).Talk(); // This is known as down casting Animal --> Cat
//        ((Dog)dog).Talk(); // (Type of) Animal --> (Type of)Dog
        System.out.println(dog.getName());
        //System.out.println(animal.getName());
        System.out.println(puppy.getName());
        dog.talk("This is my voice");
        dog.talk("This is another voice");
    }

    private static void basic() {
        int number = 1;
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(--number);
        System.out.println(number--);
    }
}