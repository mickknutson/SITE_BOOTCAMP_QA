package com.company.core.animalClass;

public class Animal {
private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

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
        //down-casting
        Animal cat = new Cat("Cimba");
        cat.eat();

        //way 1
        Cat c = (Cat)cat;
        c.talk();

        //way 2
        ((Cat)cat).talk();



    }
}


