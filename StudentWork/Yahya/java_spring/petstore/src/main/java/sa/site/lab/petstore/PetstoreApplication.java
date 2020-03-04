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
import sa.site.lab.petstore.service.AnimalServiceImpl;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication{

	// Only Fields / Variables go here...

	@Autowired
	private AnimalController controller;

	public static void main(String[] args) { // Start of MAIN method
		System.out.println("* Start main()");
		SpringApplication.run(PetstoreApplication.class, args);
		System.out.println("* end main()");

	} // End of MAIN method

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("* start commandLineRunner");

			List<Animal> animals = controller.findAll();

			if(animals != null) {
				System.out.println("*** Animals: " + animals);
			} else{
				System.out.println("No animals found");
			}

			Animal animal = controller.findPet(1);
			if(animal != null) {
				animal.eat();
			} else {
				System.out.println("Animal 1 is not found");
			}

			System.out.println("* end commandLineRunner");
		};
	}

} // End of Class
