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

            System.out.println("* Start commandLineRunner");
            System.out.println("Add a new Dog");
            Animal dog = new Animal();
            dog.setName("fido");
            dog.setSound("woof");
            dog.setType("DOG");

            //--------------------------------------------------------
            Animal animal1 = controller.findById(1);
            if(animal1==null){
                System.out.println("animal is null");
            }
            //___________________________________________________
            List<Animal>animals=controller.findAll();
            System.out.println("Animal: "+ animals);
            //___________________________________________________
            controller.add(dog);
            //___________________________________________________
            Animal animal2=controller.findById(1);
            if (animal2==null){
                System.out.println("animal is null");

            }

            else {
                System.out.println("Animal " + animal2.getName());
            }

            //___________________________________________________
            animals= controller.findAll();
            System.out.println("Animal: "+ animals);


//            List<Animal> animals = controller.findAll();
//
//            System.out.println("*****Animals" + animals);
//
//            for (int i = 0; i < animals.size(); i++) {
//                animals.get(i)./eat();
//            }
//
//            Animal animal = controller.findById(1);
//            animal.eat();


            System.out.println("end commandLineRunner");

            //----------------------------------------------------
//            System.out.println("Number of animals:" + animals.size());
//
//            controller.add(new Animal("Poppy"));
//
//            animals=controller.findAll();
//
//            System.out.println("* POST Number of animals" + animals.size());
//            //----------------------------------------------------
//
//
//            System.out.println("* end commandLineRunner");
        };
    }

}
