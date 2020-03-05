package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {


    @Autowired
    private AnimalController controller;// Automatically wire


    public static void main(String[] args) {
        System.out.println("*Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("*end main()");


    } //END MAIN

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("*Start  commandLineRunner");
            System.out.println("Add a new Dog:");

            //-------------------------------------------
            Animal dog = new Animal ();
            dog.setName("Fido");
            dog.setSound("Woof");
            dog.setType("DOG");  //DOG, CAT
            //-------------------------------------------
            Animal animal1= controller.findById(1);
            if(animal1==null){
                System.out.println("Animals: ");
            }
            //-------------------------------------------

            List <Animal> animals = controller.findAll();
            System.out.println("List of Animal: " +animals);

            //-------------------------------------------
            controller.add(dog);
            //-------------------------------------------

            Animal animal2 = controller.findById(1);
            if (animal2 == null){
                System.out.println("Animal is null");
            } else {
                System.out.println("Animal:" + animal2.getName());
            }
            //-------------------------------------------
            animals= controller.findAll();
            System.out.println("List of Animal: " +animals);



            System.out.println("end commandLineRunner");


        };
    }

}
