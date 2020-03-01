package com.site.core.animal;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void talk(){
        System.out.println("mew");
    }

}
