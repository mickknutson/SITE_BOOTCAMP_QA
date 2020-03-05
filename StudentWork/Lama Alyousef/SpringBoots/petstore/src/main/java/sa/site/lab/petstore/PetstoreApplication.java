package sa.site.lab.petstore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {


    @Autowired
    private AnimalController controller;


    public static void main(String[] args) {
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");

    } // End of MAIN Method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");
            List<Animal> animals = controller.findAll();

            if (animals != null) {
                System.out.println("*****Animals" + animals);
            } else {
                System.out.println("No animal found");
            }


            Animal animal = controller.findById(1);
            if (animal != null) {
                animal.eat();
            } else {
                System.out.println(" No animal");
            }
            // -----------------------------------------------------

            System.out.println(" * POST Number of animals: " + animals.size()); // Print size BEFORE add new animal

            // Create New Animal
            controller.add(new Cat("Bob"));

            List<Animal> updatedAnimal = controller.findAll();

            System.out.println(" * POST Number of animals: " + updatedAnimal.size()); // Print size AFTER add new animal
            //----------------------------------------------------------

            System.out.println("* End CommandLineRunner *");


        };
    }

}
