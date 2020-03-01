package com.company.core;

import com.company.core.animalClass.Dog;
import com.company.core.animalInterface.AnimalInterface;
import com.company.core.animalInterface.CatInter;
import com.company.core.animalInterface.DogInter;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest
{
    public static void main(String[] args)
    {
        /// Collections

        //classes collections

        List<Dog> dogs = new ArrayList();

        dogs.add(new Dog("dog1"));
        dogs.add(new Dog("dog2"));
        dogs.add(new Dog("dog3"));

        for (Dog dog: dogs)
        {
            dog.eat();
        }


        // Importance of interface
        List<AnimalInterface> animals = new ArrayList();

        animals.add(new DogInter("dog1"));
        animals.add(new DogInter("dog2"));
        animals.add(new CatInter("cat1"));

        for (AnimalInterface animal: animals)
        {
            animal.eat();
        }


    }
}
