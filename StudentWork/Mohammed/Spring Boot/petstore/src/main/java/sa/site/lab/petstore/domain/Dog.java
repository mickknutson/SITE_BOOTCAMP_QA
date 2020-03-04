package sa.site.lab.petstore.domain;

import org.springframework.stereotype.Component;

<<<<<<< Updated upstream:StudentWork/Mohammed/Spring Boot/petstore/src/main/java/sa/site/lab/petstore/domain/Dog.java
public class Dog implements Animal {

    private String name;
    public Dog (){

    }
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
=======
>>>>>>> Stashed changes:StudentWork/Sadeem/SpringBoot/petstore/src/main/java/sa/site/lab/petstore/domain/Dog.java
}
