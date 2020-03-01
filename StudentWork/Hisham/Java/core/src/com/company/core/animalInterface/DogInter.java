package com.company.core.animalInterface;

public class DogInter implements AnimalInterface
{

    private String name;

    public DogInter(String name)
    {
        this.name = name;

    }

    @Override
    public void eat()
    {
        System.out.println("Nom , nom , nom");
    }

    public void talk(String voice)
    {
        System.out.println(voice);
    }

}
