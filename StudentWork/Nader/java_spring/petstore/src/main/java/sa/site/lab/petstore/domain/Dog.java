package sa.site.lab.petstore.domain;


import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;

//stereotypes
@Entity
public class Dog implements Animal {

    // map fields to DB columns

    
    private int id;
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("nom, nom,nom");
    }

    public void talk(String voice) {
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
