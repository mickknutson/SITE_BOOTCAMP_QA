package sa.site.lab.petstore.domain;

import javax.persistence.Entity;

//stereotype:
@Entity
public class Dog implements Animal {
    private int id;
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating : Nom , nom , nom");
    }

    public void talk(String voice) {
        System.out.println(voice);
    }

}
