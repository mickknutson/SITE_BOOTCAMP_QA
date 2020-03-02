package com.company.core;

import com.company.core.Animal.Animal;
import com.company.core.Animal.Cat;
import com.company.core.Animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {


    public static void main(String[] args) {
        //collection
        //Array
        //List
        //Set
        //Map(key-value)
        //create a list of dogs
        //add 3+ days to list
        //loop through list and print out dog.eat

        List<Animal> list = new ArrayList<>();
        list.add(new Dog("fido"));
        list.add(new Dog("chunk"));
        list.add(new Cat("Phebe"));

        for (Animal a : list) {
            a.eat();

        }


    }
}
