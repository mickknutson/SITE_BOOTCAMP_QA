package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.controller.AnimalController;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

    //@Autowired
    // private AnimalDao dao;

    // @Autowired
    //private AnimalService service;

    @Autowired
    private AnimalController controller;

    public static void main(String[] args) {
        System.out.println(" ** Start Main **");

        SpringApplication.run(PetstoreApplication.class, args);

        System.out.println(" ** End Main **");

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {
            //Runnable code goes here ...
            //System.out.println("** animal dao output: **");
            //map<string,object> context
            //AnimalDao dao=ctx.getBean(AnimalDao.class);
            //Animal animal = service.findPet(1);
            //animal.eat();
            //mytrial
            System.out.println(" ** Start CommandLine Runner **");

            //System.out.println("** animal dao output: **");

            List<Animal> animals = controller.findAll();
            if (animals != null) {
                System.out.println(" **** Animals: " + animals);
            } else {
                System.out.println("No Animals Found 1!!");
            }
            Animal animal = controller.findPet(1);
            if (animal != null) {
                animal.eat();
            } else {
                System.out.println("No Animal found at 1");

            }
            System.out.println(" ** End CommandLine Runner **");


        };
    }

}
