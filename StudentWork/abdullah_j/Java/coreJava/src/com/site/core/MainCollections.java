package com.site.core;

import com.site.core.animal.Animal;
import com.site.core.animal.Cat;
import com.site.core.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>(5);

        animals.add(new Dog("dog1"));
        animals.add(new Dog("dog2"));
        animals.add(new Cat("cat1"));

        for (Animal animal: animals) {
            animal.eat();
        }

    }

}
