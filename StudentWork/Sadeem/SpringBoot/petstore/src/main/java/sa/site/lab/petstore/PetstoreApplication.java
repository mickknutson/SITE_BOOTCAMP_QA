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

            System.out.println(" ** Add a new Dog **");
            Animal dog = new Animal();
            dog.setName("Fido");
            dog.setSound("woof");
            dog.setType("DOG"); //DOG or CAT for the type

            //_____________________________________________________//
           List<Animal> animals = controller.findAll();
            System.out.println(" List of Animals: " +animals);
            //______________________________________________________//
            controller.add(dog);
            //______________________________________________________//

            Animal animal2 = controller.findById(1);
            if(animal2 == null){
                System.out.println("animal is null");
            } else{
                System.out.println("animals: " +animal2.getName());
            }
            //______________________________________________________//

            animals = controller.findAll();
            System.out.println("List of Animal: " + animals);
            System.out.println(" ** End CommandLine Runner **");
        };
    }

} //end of Class
