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
public class PetstoreApplication { // BEGINING OF CLASS ..

    @Autowired
    private AnimalController controller;

    //@Autowired
    //private Animal animal;

    public static void main(String[] args) { // START OF main Method ..
        System.out.println("Start Main ....................................");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("End Main ........................................");
    } // END OF main METHOD ..

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>> Spring command RUNNER!!" +
                    " <<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");

            System.out.println("Add new Dog : ");
            Animal dog = new Animal();
            dog.setName("Mooo");
            dog.setSound("Woof");
            dog.setType("DOG"); // DOG , CAT ..

            List<Animal> animals = controller.findAll();
            System.out.println("List of Animals : " + animals);
            controller.add(dog);

            Animal animal2 = controller.findById(1);
            if (animal2 == null ){
                System.out.println("Animal is null!");
            } else {
                System.out.println("Animal : " + animal2.getName());
            }

            animals = controller.findAll();
            System.out.println(" List of Animals : " + animals);


            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>> End Commmand RUNNER" +
                    " <<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        };
    }

//    private void mySolution() {
//        // Add animals ..
//        controller.addAnimal(animal);
//        controller.addAnimal(animal);
//        controller.addAnimal(animal);
//
//        // Get all animals ..
//        List<Animal> animals = controller.findAll();
//
//        //Print size of list :
//        System.out.println("///////////////////////// Printing List Size ///////////////////////////////");
//        System.out.println(animals.size());
//
//        // Print all animals :
//        System.out.println("///////////////////////// Printing all animals ///////////////////////////////");
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println("Animal #" + i + " , " + animals.get(i));
//        }
//    }

//    //private void testMethod() {
//        //System.out.println("<<<<<<<<<<<>>>>>>>>>>> Animal output : <<<<<<<<<<>>>>>>>>>>>>");
//        // Map<String,Object>
//        // BY name (key)
//        //AnimalDao dao1 = (AnimalDao) ctx.getBean("animalDao");
//        // BY type (value)
//        //AnimalDao dao = ctx.getBean(AnimalDao.class);
//
//        Animal animal = controller.findPet(1);
//        animal.eat();
//    }
//
//    public List<Animal> addRetriveAnimals() {
//
//        List<Animal> animalsList = new ArrayList<>();
//
//        // CATS ..
//        Animal cat1 = new Cat("CAT #1");
//        animalsList.add(cat1);
//
//        Animal cat2 = new Cat("CAT #2");
//        animalsList.add(cat2);
//
//        Animal cat3 = new Cat("CAT #3");
//        animalsList.add(cat3);
//
//
//        //DOGS ..
//        Animal dog1 = new Dog("DOG #1");
//        animalsList.add(dog1);
//
//        Animal dog2 = new Dog("DOG #2");
//        animalsList.add(dog2);
//
//        Animal dog3 = new Dog("DOG #3");
//        animalsList.add(dog3);
//
//        return animalsList;
//
//
//    }

} //  END OF CLASS ..

// Create a list of animals .. then return that list of animals
