package sa.site.lab.petstore.domain;

import javax.persistence.*;

/**
 * This is my contract obligation
 */
@Entity
public class Animal{

    // Map field to DB columns:
    // Primary Key:
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String sound;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    // These are behavior:
    // TODO: Ignore these methods in JPA:

    @Transient
    public void eat(){
        throw new RuntimeException("not yet implemented");
    }

    @Transient
    public void talk(String voice){
        throw new RuntimeException("not yet implemented");
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


    // Setter & Getter ------------------------------//

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
} // The End...
