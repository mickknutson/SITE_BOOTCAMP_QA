package com.company.core.Animal;

public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }
    public String getName() {
        System.out.println("Puppy.getName");
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
}
