package com.company.animal;

import java.util.ArrayList;
import java.util.List;

public class MailList {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            animals.add(new Dog("#Dog"));
            animals.add(new Cat("#Cat"));

        }


        for (Animal animal : animals) {
            animal.eat();
        }

    }
}
