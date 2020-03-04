package sa.site.lab.petstore.domain;

import javax.persistence.Entity;

// Stereotype:
@Entity
public class Dog implements Animal {
    //public Dog(){
       // setName("Mutt");
   // }
    private int id;
    private String name;
    public Dog() {}
    public Dog (String name){
        this.name = name;
    }
    //public Dog(String name) {
       // setName(name);
    //}
    @Override
    public void eat (){
        System.out.println("nom, nom, mom");
    }
    public void talk(String voice) {
        System.out.println("Voice: " + voice);
    }
    public void talk() {
        System.out.println("bark");
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
}