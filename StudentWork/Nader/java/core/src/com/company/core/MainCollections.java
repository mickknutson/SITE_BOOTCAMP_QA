package com.company.core;

import com.company.core.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {

    public static void main(String[] args) {
        //Array
        //List
        //Map(key == value)
        //Set

        //Create a list of dogs only
        List<Dog> dogs = new ArrayList<>();

        // Add 3+ dogs to list
        dogs.add(new Dog("dog 1"));
        dogs.add(new Dog("dog 2"));
        dogs.add(new Dog("dog 3"));
        //Loop through list and print out dog.eat()
        for (Dog dog : dogs){
            //dog.talk("I am the : ");
            dog.eat();
        }

    }
}
