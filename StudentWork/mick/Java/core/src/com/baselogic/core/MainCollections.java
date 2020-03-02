package com.baselogic.core;

import com.baselogic.core.animal.Animal;
import com.baselogic.core.animal.Cat;
import com.baselogic.core.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {

    public static void main(String[] args) {
        // Collection
        // Create a list of Dogs ONLY.
        // Add 3+ dogs to list

        // Loop through list and print out dog.eat()
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("fido"));
        animals.add(new Dog("Chuck"));

        animals.add(new Cat("Feline"));
//        animals.add("Some String");
//        animals.add(new Integer(1234));

//        for(int i = 0; i < animals.size(); i++){}
        // Enhanced For-loop
        for (Animal animal : animals) {
            animal.eat();
        }


    }

} // The End...
