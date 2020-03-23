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
 * 1. Add ADD, Delete functional for Thymeleaf
 * 2. Add REST Support
 */




@SpringBootApplication
public class PetstoreApplication {

    //@Autowired
    // private AnimalDao dao;

    // @Autowired
    //private AnimalService service;

    //@Autowired
    //private AnimalController controller;

    public static void main(String[] args) {

        SpringApplication.run(PetstoreApplication.class, args);

    }
    //Run this code first as test code:
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {

            System.out.println(" ** Start CommandLine Runner **");
            System.out.println(" ** Sand Box Code Only **");


        };
    }

}
/*

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
                    //-------------------------------------------------------------
                    System.out.println("Number of animals: "+animals.size());

                    //Create New  Animal:
                    controller.add(new Animal("bob"));
                    List<Animal> updatedAnimal = controller.findAll();


        //-------------------------------------------------------------
        System.out.println("POST Number of animals: "+updatedAnimal.size());*/
//????????????????????????????????????????????????????????????????????????????????????
   /* System.out.println("Add a new Dog:");

            Animal dog = new Animal();
            dog.setName("Fido");
            dog.setSound("woof");
            dog.setType("Dog");
           *//* Animal animal1 = controller.findById(1);
            if (animal1 == null) {
                System.out.println("Animal is NULL");
            }*//*
            //_____________________________________________________________________________________//
            // List<Animal> animals = controller.findAll();
            //System.out.println("List of Animals: "+animals);
            //_____________________________________________________________________________________//
            // THIS LINE MUST BE DELETED IF USING data.sql
            //TO NOT DO CRUD FROM MULTIPLE PLACES
            //controller.add(dog);

            //_____________________________________________________________________________________//
            Animal animal2 = controller.findById(1);

            if (animal2 == null) {
                System.out.println("Animal is NULL");
            } else {
                System.out.println("Animal: " + animal2.getName());
            }
            // toString method is assumed here (animals.toString())

            //animals =controller.findAll();
            //System.out.println("List of Animals: "+animals);
*/