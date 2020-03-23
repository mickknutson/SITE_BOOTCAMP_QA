package sa.site.lab.petstore.domain;


import javax.persistence.*;
/*
Types of errors:
RunTime errors
LoadTime errors
CompliedTime errors
*/

@Entity
public class Animal {
    //Map field to DB columns
    //Primary Key:
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String sound;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    // toString method is specified by me
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }

    //These are behavior UNLIKE setters and getters
    //TODO: Ignore these methods in JPA:

    @Transient
    public void eat() {
        throw new RuntimeException("not yet emplemented");

    }

    @Transient
    public void talk(String voice) {
        throw new RuntimeException("not yet emplemented");


    }
    //Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
