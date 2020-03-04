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


    @Autowired
    private AnimalController controller;// Automatically wire


    public static void main(String[] args) {
        System.out.println("*Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("*end main()");


    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* commandLineRunner");

            List<Animal> animals = controller.findAll();

            System.out.println("*****Animals" + animals);

            for (int i = 0; i < animals.size(); i++) {

                animals.get(i).eat();
            }

            Animal animal = controller.findPet(1);
            animal.eat();


            System.out.println("end commandLineRunner");

        };
    }

}
