package sa.site.lab.petstore.domain;

import javax.persistence.Entity;

@Entity
public class Animal {
    // primary key
    private int id ;
    private String name;
    private String type;
    private String sound;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    // TODO: Ignore these methods in JPA
    public String getName() {
        return name;
    }
    public void eat() {
       throw  new RuntimeException("Not yet implemented");
    }

    public void talk(String voice){
        throw new RuntimeException("Not yet implemented");
    }

}
