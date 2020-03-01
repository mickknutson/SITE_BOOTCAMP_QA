package com.site.core.animal;

public class Animal {

    // Default Constructor
    public Animal() {
        this.name = "generic";
    }

    public Animal(String name) {
        this.name = name;
    }

    // body of my class:
    //1. fields / variables --> STATE
    private String name;

    // Methods / Behavior
    public void eat() {
        System.out.println(name + " is eating [nom, nom, nom...]");
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.eat();
        ((Dog) dog).talk();
        ((Cat) cat).talk();

        ///////////////////////////////////////////////////////////

        Animal generic = new Animal();
        Animal wolf = new Animal("Wolf");

        generic.eat();
        wolf.eat();
    }

}
