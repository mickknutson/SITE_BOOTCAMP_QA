package com.site.core.animal;

public class Animal {

    public void eat(){
        System.out.println("nom, nom...");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();

    }

}
