package com.company;
import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;
import com.company.animal.Puppy;
import com.sun.tools.javac.comp.Resolve;

public class Main {


    public static void main(String[] args) {


        Animal animal = new Puppy("pup");
        Animal dog = new Dog("Dogee");
        Animal cat = new Cat("kitty");

        animal.eat();

        dog.talk("woof");
        cat.talk("meow");

    /*  Animal animal = new Animal();
     Dog dog = new Dog("DeeOhGee");
     Cat cat = new Cat("kitty");

        // Puppy puppy = new Puppy("pup");

        animal.eat();

     dog.talk();
     dog.talk("woof");

     /* puppy.eat();
     dog.eat();
     cat.eat();

     cat.talk();

     System.out.println(animal.getName());
     System.out.println(dog.getName());
     System.out.println(puppy.getName()); */

        // write your code here
    }
}
