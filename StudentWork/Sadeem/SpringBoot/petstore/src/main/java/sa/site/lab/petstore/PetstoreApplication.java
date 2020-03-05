package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

    //only FIELDS / VARIABLES go here.....
    @Autowired
    private AnimalController controller;

    public static void main(String[] args) { //start of MAIN method
        System.out.println("* start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* end main()");
    } // end of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args ->{
            System.out.println(" ** Start CommandLine Runner **");

            List<Animal> animals = controller.findAll();
            if (animals != null) {
                System.out.println(" **** Animals: " + animals);
            } else {
                System.out.println("No Animals Found 1!!");
            }

            Animal animal = controller.findById(1);
            if (animal != null) {
                animal.eat();
            } else {
                System.out.println("No Animal found at 1");

            }
            // ----------------------------------------------------------------
            System.out.println("Number of animals: "+animals.size());

            //Create New Animal
            controller.add(new Dog("Bob"));
            List<Animal> updatedAnimal= controller.findAll();
            System.out.println("POST Number of animals: "+updatedAnimal.size());

            // -----------------------------------------------------------------
            System.out.println(" ** End CommandLine Runner **");
        };
    }

} //end of Class
