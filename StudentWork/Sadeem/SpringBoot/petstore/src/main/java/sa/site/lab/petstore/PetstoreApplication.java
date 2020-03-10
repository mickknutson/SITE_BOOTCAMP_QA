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

/**
 * TODO:
 * 1. Add ADD, DELETE, functional for Thymeleaf
 * 2. Add REST Support
 */
@SpringBootApplication
public class PetstoreApplication {

    //only FIELDS / VARIABLES go here.....
    @Autowired
    private AnimalController controller;

    public static void main(String[] args) { //start of MAIN method
        SpringApplication.run(PetstoreApplication.class, args);
    } // end of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args ->{
            System.out.println(" ** Start CommandLine Runner **");
            System.out.println(" ** Sand box code only **");



        };
    }

} //end of Class
