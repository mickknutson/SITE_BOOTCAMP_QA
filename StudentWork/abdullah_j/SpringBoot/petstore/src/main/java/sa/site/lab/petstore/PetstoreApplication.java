package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication{

    // Only Fields / Variables go here...

//    @Autowired
//    private AnimalDao dao;

//    @Autowired
//    private AnimalService service;

    @Autowired
    private AnimalController controller;

	public static void main(String[] args) { // Start of MAIN method
        System.out.println("*** Start main() ***");
		SpringApplication.run(PetstoreApplication.class, args);

        System.out.println("*** End main() ***");
	} // End of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("*** start Spring Command Line Runner ***");

            //AnimalDao dao = new AnimalDao();
            //AnimalDao dao = ctx.getBean(AnimalDao.class);


            Animal animal = controller.findPet(1);
            if (animal != null){
                animal.eat();
            }



            List<Animal> animals = controller.findAll();
            System.out.println("*** Animals: " + animals);


            System.out.println("*** end Spring Command Line Runner ***");
        };
    }

} // End of Class
