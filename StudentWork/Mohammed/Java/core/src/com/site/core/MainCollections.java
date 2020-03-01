package com.site.core;

import com.site.core.animal.Animal;
import com.site.core.animal.Cat;
import com.site.core.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {

    public static void main (String[] args){

        // Collection :
        // Array
        // list
        // Set
        // Map (key =  value)
        // Assigment ceate a list of Dogs ONLY.
        // add 3 or more dog to list

        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        for (int i = 0; i <dogs.size(); i ++){
            System.out.println(" Dog #"+ i);
            dogs.get(i).eat();
        }

        /*
        another way of adding dog objects
        for (int i = 0; i <dogs.size(); i ++){
            Dog dog = new Dog("Dog"+i);
            dogs.add(dog);
        }
         */

        // Mick's Answer : .....
        List <Animal> animals = new ArrayList<>();
        animals.add(new Cat("cat"));
        animals.add(new Dog("Dog name"));
        animals.add(new Dog("Osacer"));

        // Enhanced FOR LOOP !
        for (Dog d: dogs){
            d.eat();
        }



        }
} // The End ....
