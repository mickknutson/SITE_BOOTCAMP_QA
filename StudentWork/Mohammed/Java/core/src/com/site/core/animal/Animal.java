package com.site.core.animal;

public class Animal {

    public void eat(){
        System.out.println("nom, nom, nom");
    }

    public static void main (String[] args){

        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();
    }
}
