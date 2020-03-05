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

    // the best way of object
    @Autowired
    private AnimalController controller;

    public static void main(String[] args) {
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");

            System.out.println("Add a new Dog");
            Animal dog = new Animal();
            dog.setName("Fido");
            dog.setSound("woof");
            dog.setType("DOG");

            List<Animal> animals= controller.findAll();
            System.out.println(" Animal: "+animals);
            Animal animal1= controller.findById(1);
            if(animal1== null){
                System.out.println("animal is null");
            }
            controller.add(dog);

            Animal animal2= controller.findById(1);
            if(animal2== null){
                System.out.println("animal is null");
            }else {
                System.out.println("Animal: "+ animal2.getName());
            }


             animals= controller.findAll();
            System.out.println(" List of Animal: "+animals);




            System.out.println("* End CommandLineRunner *");
            // BY name (key)
            //AnimalDao dao1 = (AnimalDao) ctx.getBean("AnimalDao");
            // By type (value) Best way
            //AnimalDao dao = ctx.getBean(AnimalDao.class);


//            Animal animal = controller.findById(1);
//            if(animal != null){
//                animal.eat();
//            }else {
//                System.out.println("there is no animal with ID 1");
//            }
//
//            List<Animal> animals = controller.findAll();
//
//            //animals.forEach((k, v) -> System.out.println("id: " + k + " Animal" +v.getName() ));
//            //List <Animal> animals =controller.findPet(1);
//
//           for(int i =0;i<animals.size();i++){
//               System.out.println(animals.get(i).getName());
//           }
//
//            System.out.println("Number of animals: "+animals.size());
//
//            controller.add(new Animal("Bob"));
//
//            List<Animal> updatedAnimls= controller.findAll();
//            System.out.println("POST number of animals: "+updatedAnimls.size());



        };

    }

}
