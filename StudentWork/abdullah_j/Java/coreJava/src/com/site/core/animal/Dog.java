package com.site.core.animal;

public class Dog extends Animal {

    public Dog() {
        setName("mutt");
    }

    public Dog(String name) {
        setName(name);
    }


    public void talk() {
        System.out.println("bark");
    }

    public void talk(String voice) {
        System.out.println(voice);
    }


}
