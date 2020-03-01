package com.company.core.animalClass;

public class Dog extends Animal
{

    public Dog(String name)
    {
        super(name);
    }

    public void talk()
    {
        System.out.println("bark");

    }
    public String getName()
    {
        return super.getName();
    }


}
