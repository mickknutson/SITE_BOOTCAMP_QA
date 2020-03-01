package com.baselogic.core;

import com.baselogic.core.animal.Animal;
import com.baselogic.core.animal.Cat;
import com.baselogic.core.animal.Dog;
import com.baselogic.core.animal.Puppy;

import java.util.ArrayList;
import java.util.List;

public class Main { // extends Object

    // Method Block of code:
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog("Dogee");
        Cat cat = new Cat("kitty");

        animal.eat();

        dog.talk();
        dog.talk("woof");

    } // end main() BLOCK

} // The End Main...
