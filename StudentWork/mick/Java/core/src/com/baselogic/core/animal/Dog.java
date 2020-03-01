package com.baselogic.core.animal;

public class Dog implements Animal{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("nom, nom,nom");
    }

    public void talk(String voice){
        System.out.println(voice);
    }

    // Accessor:
    // Override:
    // Animal.getName / Dog.getName
    public String getName() {
        System.out.println("2. inside Dog.getName");
        return this.name;
    }

}
