package com.company.core;

import com.company.core.Animal.Animal;
import com.company.core.Animal.Cat;
import com.company.core.Animal.Dog;
import com.company.core.Animal.Puppy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal=new Animal();
        Dog dog=new Dog("DeeOgGee");
        Cat cat=new Cat("kitty");

        animal.eat();
        dog.talk();
        dog.talk("woof");

    }
}
//generic.eat();
// wolf.eat();
//cat.talk();
// dog.talk();
//System.out.println(dog.getName());
//System.out.println(pup.getName());
// System.out.println(animal.getName());
//Puppy pup=new Puppy("Pup");
// Animal wolf=new Animal("WOLF");

// dog.eat();
// cat.eat();