package com.company.core.animal;

public class Animal {
private  String name;
    public  Animal()
    {
         this.name = "generic";

    }

    public  Animal(String name)
    {
        this.name = name;

    }

    public void eat()
    {
        System.out.println(name+" is Eating ...");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal wolf = new Animal("wolf");
        animal.eat();
        wolf.eat();

        Dog dog = new Dog();
        dog.talk();
        dog.eat();

        //down-casting
        Animal cat = new Cat();
        cat.eat();

        //way 1
        Cat c = (Cat)cat;
        c.talk();

        //way 2
        ((Cat)cat).talk();



    }
}


