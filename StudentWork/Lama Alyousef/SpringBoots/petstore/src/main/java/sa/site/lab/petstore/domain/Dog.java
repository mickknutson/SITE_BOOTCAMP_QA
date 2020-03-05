package sa.site.lab.petstore.domain;

import javax.persistence.Entity;

// Stereotype:
@Entity

public class Dog implements Animal {

    // Map field to DB columns:
    private int id;

    private String name;

    public Dog(){ }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void talk() {

        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating nom, nom, nom");
    }

    @Override
    public void talk(String voice) {

        System.out.println(voice);
    }
}
