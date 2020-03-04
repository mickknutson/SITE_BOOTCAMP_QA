package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.AnsiOutputApplicationListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.Animalcontroller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.service.AnimalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class PetstoreApplication {

    // the best way of object
    @Autowired
    private Animalcontroller controller;

    public static void main(String[] args) {
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");
            // BY name (key)
            //AnimalDao dao1 = (AnimalDao) ctx.getBean("AnimalDao");
            // By type (value) Best way
            //AnimalDao dao = ctx.getBean(AnimalDao.class);

//
//            Animal animal = controller.findPet(1);
//            animal.eat();
            List<Animal> animals = controller.findAll();

            //animals.forEach((k, v) -> System.out.println("id: " + k + " Animal" +v.getName() ));
            //List <Animal> animals =controller.findPet(1);

           for(int i =0;i<animals.size();i++){
               System.out.println(animals.get(i).getName());
           }
            System.out.println("* End CommandLineRunner *");
        };

    }

}
