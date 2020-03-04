package sa.site.lab.petstore.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
public class Dog implements Animal {

    private int id;

    private String name;

    public Dog (){ }

    public Dog (String name){
        this.name = name;
    }

    public void talk(){
        System.out.println(" Bark!!");
    }
    public void talk(String voice){
        System.out.println("voice");
    }


    public String getName(){
        System.out.println("Dog.getName");
        return  this.name;
    }

    @Override
    public void eat() {
        System.out.println(" Hum hum hum!!");
    }
}
