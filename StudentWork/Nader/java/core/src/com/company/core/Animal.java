package com.company.core;

public class Animal {

    private String name;

    public Animal(){
        this.name = "Wolf";
    }

    public Animal(String name){
        this.name = name;
    }
    public void Eat() {
        System.out.println(this.name+"I am eating now --> still eating...");
    }

    public static void main(String[] args) {
        Animal generic = new Animal();
        Animal wolf = new Animal("I am a Wolf");
        generic.Eat();
        wolf.Eat();
    }
}