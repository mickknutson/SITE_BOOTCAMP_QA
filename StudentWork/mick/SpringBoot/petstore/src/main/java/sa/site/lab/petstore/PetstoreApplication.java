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
public class PetstoreApplication{

    // Only Fields / Variables go here...

    @Autowired
    private AnimalController controller;

	public static void main(String[] args) { // Start of MAIN method
        System.out.println("* Start main()");
		SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* end main()");

	} // End of MAIN method

    // RUN THIS CODE FIRST AS TEST CODE:
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* start commandLineRunner");

            System.out.println("Add a new Dog:");

            Animal dog = new Animal();
            dog.setName("Goofy");
            dog.setSound("bark bark");
            dog.setType("DOG"); // DOG, CAT


            //---------------------------------------------------------------//
            // Should have ZERO pets in DB:
            List<Animal> animals = controller.findAll();
            System.out.println("List of Animals: " + animals);

            //---------------------------------------------------------------//
            // Add single pet to DB PK=1 :
//            controller.add(dog);

            //---------------------------------------------------------------//
            // Find first pet from DB:
            Animal animal2 = controller.findById(1);
            if(animal2 == null){
                System.out.println("animal is null");
            } else {
                System.out.println("Animal: " + animal2.getName());
            }


            //---------------------------------------------------------------//
            // Should have one pet in DB:
            animals = controller.findAll();
            System.out.println("List of Animals: " + animals);





            System.out.println("* end commandLineRunner");
        };
    }

} // End of Class
