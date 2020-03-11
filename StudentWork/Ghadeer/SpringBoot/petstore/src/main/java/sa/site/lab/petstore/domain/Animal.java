package sa.site.lab.petstore.domain;

import javax.persistence.*;

@Entity
public class Animal {

    //Map field to DB columns

    @Id //Primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String sound;


    //Default constructor
    public Animal(){
        this.name="Default";
    }
    //receiving data constructor
    public Animal(String name){
        this.name=name;
    }

    //accessor
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

     //these are behavior

    // TODO: Ignore these methods in JPA:

    @Transient
    public void eat() {
        throw new RuntimeException("Not yet implemented");
    }

    @Transient
    public void talk() {
        throw new RuntimeException("Not yet implemented");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
