package com.company.core.animal;

public class Animal {
    private String name ;
    public Animal() {
        this.name="generic";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){

        System.out.println("nom, nom, nom....");
    }

    public static void main(String[] args) {
        Animal animal= new Animal();

        animal.eat();

//        Dog dog= new Dog();
//        Animal cat = new Cat();
//
//
//        animal.eat();
//        dog.talk();
//
//        ((Cat)cat).talk(); // down Casting
    }
}
