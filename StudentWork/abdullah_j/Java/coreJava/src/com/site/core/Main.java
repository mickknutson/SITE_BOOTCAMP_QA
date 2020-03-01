package com.site.core;

import com.site.core.animal.Animal;
import com.site.core.animal.Cat;
import com.site.core.animal.Dog;
import com.site.core.animal.Puppy;

public class Main {

    private String anInstance;

    public static void main(String[] args) {

        String aLocalVariable;

        //basic();


        Animal animal = new Puppy("pup");

        Animal dog = new Dog("Dogee");
        Animal cat = new Cat("kitty");

        animal.eat();

        dog.talk("woof");
        cat.talk("meow");


    } // end main()

    private static void basic() {
        int number = 1;

        String output = (number % 2 == 0) ? "even" : "odd";
        System.out.println(output);

        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number--);
        System.out.println(--number);
    }
} // The end
