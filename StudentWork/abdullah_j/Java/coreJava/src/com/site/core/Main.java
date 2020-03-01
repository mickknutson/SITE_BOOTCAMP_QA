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

        Animal animal = new Animal();
        Dog dog = new Dog("dogee");
        Cat cat = new Cat("kitty");

        animal.eat();

        dog.talk();
        dog.talk("woof");


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
