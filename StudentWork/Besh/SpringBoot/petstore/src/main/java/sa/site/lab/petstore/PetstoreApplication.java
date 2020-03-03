package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDaoImpl;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

    //Only fields / Variables go here...
    @Autowired
    private AnimalController controller;
    //private AnimalService service;

    public static void main(String[] args) {// Start of MAIN method

        System.out.println("Starting Spring Boot");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("Stopped Spring Boot");
    }// End of MAIN method
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            // Runnable code goes here
            System.out.println("*** Spring Command Runner ***");
            System.out.println("*** Animal DAO output ***");

            // Animal DAO Goes here

            // AnimalDao dao = new AnimalDao();
            // Map<String, Object> context;
            //AnimalDao dao = (AnimalDao)ctx.getBean("animalDao");
            //AnimalDao dao = (AnimalDao)ctx.getBean(AnimalDao.class);
            //AnimalDao dao = ctx.getBean(AnimalDao.class);
            //Animal animal = dao.findPet(1);
            //Animal animal = service.findPet(1);
            List<Animal> animals = controller.findAll();
            System.out.println("Animals:" + animals);
            Animal animal = controller.findPet(1);
            animal.eat();
        };
    }
}// End of class