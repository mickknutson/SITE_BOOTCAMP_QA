package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;

/**
 * TODO:
 *
 * 1. Add ADD, DELETE functional for Thymeleaf
 *
 * 2. Add REST Support
 *
 *  * */

@SpringBootApplication
public class petstoreApplication {

    @Autowired
    private AnimalController controller;

    public static void main(String[] args) {

        //   System.out.println("* Start Main()");

        SpringApplication.run(petstoreApplication.class, args);

        //   System.out.println("* End Main()");
    }

    //THIS CODE RUNS FIRST AS TEST CODE:
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args ->

        {
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println((char) 27 + "[34m ### Start Command Runner ###");
            System.out.println("### sand box code only ###");

            /*
            // Runnable Code Will be Here ...
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println((char) 27 + "[34m ### Start Command Runner ###");
            //System.out.println("### Animal Dao output is : ###");

            // Map<String,Object> context ...
            // so you either get a map item either by its key (name) or the value (object) itself

//		 AnimalDao daoObject = ctx.getBean(AnimalDao.class);
//         AnimalDao daoByName = (AnimalDao) ctx.getBean("animalDao");

//			Animal animal = dao.findPet(2);

//            Animal animal = controller.findById(1);
//
//            List<Animal> animals = controller.findAll();
//            System.out.println("### Animals: " + animals);
//            if (animals != null) {
//                for (int i = 0; i < animals.size(); i++)
//                    animals.get(i).eat();
//            } else {
//                System.out.println("No Animals found");
//            }
//            if (animal != null) {
//                animal.eat();
//            } else {
//                System.out.println("No Animals found");
//            }
//            // ----------------------------------------------------------------
//            System.out.println("Nuber of animals: " + animals.size());
//
//            //Create New Animal
//            controller.add(new Animal("Bob"));
//
//            animals = controller.findAll();
//            List<Animal> updatedAnimal = controller.findAll();
//
//            System.out.println("Number of animals: " + animals.size());
//            System.out.println("Number of animals: " + updatedAnimal.size());
//
//            // -----------------------------------------------------------------


            System.out.println("Add a new Dog: ");
            Animal dog = new Animal();
            dog.setName("Lusy");
            dog.setSound("woof");
            dog.setType("DOG");// DOG / CAT / FISH / ...
            // -----------------------------------------------------
        //    List<Animal> animals = controller.findAll();
        //    System.out.println("Animls: " + animals);
            //-------------------------------------------------------
            //controller.add(dog);
            // ------------------------------------------------------
            Animal animal2 = controller.findById(1);

            if (animal2 == null) {
                System.out.println(" animal 2 is null");
            } else {
                System.out.println("Animal 2 : " + animal2.getName());
            }
            // -------------------------------------

        //    animals = controller.findAll();
        //    System.out.println("List of Animals: " + animals.toString());


            System.out.println("### End Command Runner ###");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
        */
        };


    }
}
