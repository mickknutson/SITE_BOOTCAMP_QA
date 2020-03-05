package sa.site.lab.petstore.domain;


import javax.persistence.*;

@Entity
public class Animal {


     @Id //Primary key
     @GeneratedValue
    private int id;
    @Column
    private String type;
    @Column
    private String name;
    @Column
    private String sound;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO: Ignore these methods in JPA:

    @Transient
    public void eat(){
        throw new RuntimeException("Not yet implemented");
    }

    @Transient
    public void talk(String name){
        throw new RuntimeException("Not yet implemented");
    }


} // The End...