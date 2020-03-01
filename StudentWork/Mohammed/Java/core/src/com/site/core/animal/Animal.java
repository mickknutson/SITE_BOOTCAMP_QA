package com.site.core.animal;

public class Animal {

    private String name;

    public Animal (){
        this.name = "generic name!";
    }

    public Animal (String name){
        this.name = name;
    }

    public void eat(){
        System.out.println( name + " nom, nom, nom");
    }
    public static void main (String[] args){

        /*
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();
        */

        Animal generic = new Animal();
        Animal lion = new Animal("lion");
        generic.eat();
        lion.eat();
    }
}
