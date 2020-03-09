package sa.site.lab.petstore.domain;


import javax.persistence.*;


@Entity
public class Animal {

    //Map field to BD columns;
    // Primary KEY
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String sound;

    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    // These are behaviors ..
    // TODO : ignore these methods in JPA:
    @Transient
    public void eat() {
       throw new RuntimeException("Not yet Implemented!");
    }

    @Transient
    public void talk(String voice) {
        throw new RuntimeException("Not yet Implemented!");
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

} // End of Class ..
