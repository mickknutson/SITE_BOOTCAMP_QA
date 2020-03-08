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


    public static void main(String[] args) { // Start of MAIN method
        SpringApplication.run(PetstoreApplication.class, args);
    } // End of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("*** start Spring Command Line Runner ***");

            System.out.println("*** end Spring Command Line Runner ***");
        };
    }

} // End of Class
