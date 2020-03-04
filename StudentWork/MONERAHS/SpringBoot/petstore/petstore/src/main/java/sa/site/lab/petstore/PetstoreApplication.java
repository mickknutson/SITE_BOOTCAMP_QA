package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.Dao.AnimalDao;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.service.AnimalService;

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

        SpringApplication.run(PetstoreApplication.class, args);
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

            System.out.println("** animal dao output: **");

            List<Animal> animals = controller.findAll();
            System.out.println(" **** Animals: "+ animals);
            Animal animal = controller.findPet(1);
            animal.eat();

        };
    }

}
