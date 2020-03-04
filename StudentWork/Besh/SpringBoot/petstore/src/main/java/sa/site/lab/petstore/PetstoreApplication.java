package sa.site.lab.petstore;

import sa.site.lab.petstore.domain.Dog;
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

    //Only fields / Variables go here...
    @Autowired
    private AnimalController controller;
    //private AnimalService service;

    public static void main(String[] args) {// Start of MAIN method
        System.out.println("Start Main()");
        //System.out.println("Starting Spring Boot");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("End Main()");
        //System.out.println("Stopped Spring Boot");
    }// End of MAIN method
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            // Runnable code goes here
            System.out.println("* Start CommandLineRunner ***");
            System.out.println("*** Animal DAO output ***");

            // Animal DAO Goes here
            List<Animal> animals = controller.findAll();
            if (animals != null){
                System.out.println(" Animals: " + animals);
            }
            else{
                System.out.println("Not Found");
            }
            //Map<Integer, Animal> animals = controller.findAll();
            //System.out.println("Animals:" + animals);
            Animal animal = controller.findById(2);
            if (animals != null){
                animal.eat();
            }
            else{
                System.out.println("Animal 2 is Not Found");
            }
            //---------------------------
            System.out.println("Number of animals: " + animals.size());
            //create a new Animal:
            controller.add(new Dog ("Bob"));
            List<Animal> updatedAnimal = controller.findAll();
            System.out.println("* POST Number of animals " + updatedAnimal.size());
            //---------------------------
            //animal.eat();
            System.out.println("* End CommandLine Runner");
            // AnimalDao dao = new AnimalDao();
            // Map<String, Object> context;
            //AnimalDao dao = (AnimalDao)ctx.getBean("animalDao");
            //AnimalDao dao = (AnimalDao)ctx.getBean(AnimalDao.class);
            //AnimalDao dao = ctx.getBean(AnimalDao.class);
            //Animal animal = dao.findPet(1);
            //Animal animal = service.findPet(1);
        };
    }
}// End of class