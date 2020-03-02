package com.company;
import java.util.ArrayList;
import java.util.List;

import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;

public class MainCollections {

    public static void main(String[] args){
        //// Collection: ////
        // Array
        // List
        // Set
        // Map (Key=value)

        ////// Lap Questions: /////
        // Create a list of Dogs ONLY
        // Add 3+ dogs to list

        // Loop through list and print out dog.eat

        List<Animal> animals = new ArrayList();

        animals.add(new Dog("fido"));
        animals.add(new Dog("Chuck"));

        animals.add(new Cat("Feline"));

        // Enhanced For loop
        for(Animal animal: animals){
            animal.eat();
        }
    }
}
