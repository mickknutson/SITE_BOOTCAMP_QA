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

    // Only Fields / Variables go here...

//    @Autowired
//    private AnimalDao dao;

//    @Autowired
//    private AnimalService service;

    @Autowired
    private AnimalController controller;

    public static void main(String[] args) { // Start of MAIN method
        System.out.println("*** Start main() ***");
        SpringApplication.run(PetstoreApplication.class, args);

        System.out.println("*** End main() ***");
    } // End of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("*** start Spring Command Line Runner ***");

            //AnimalDao dao = new AnimalDao();
            //AnimalDao dao = ctx.getBean(AnimalDao.class);


            Animal animal = controller.findById(1);
            if (animal != null) {
                animal.eat();
            }


            List<Animal> animals = controller.findAll();
            if (animal != null && animals.size() != 0) {
                System.out.println("*** Animals: " + animals);
            }
            else{
                System.out.println("No animals found");
            }


            //---------------------------------------------------

            if (animal != null && animals.size() != 0) {
                System.out.println("*** Number of Animals: " + animals.size());
            }

            //Create new animal
            controller.add(new Animal("Bob"));

            List<Animal> updatedAnimals = controller.findAll();

            System.out.println("*** POST Number of Animals: " + updatedAnimals.size());

            System.out.println("*** end Spring Command Line Runner ***");
        };
    }

} // End of Class
