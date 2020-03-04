package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

//	@Autowired
//	private AnimalDao dao;

	@Autowired
	private AnimalController controller;
	public static void main(String[] args)
	{

		System.out.println("*Start Main*");
		SpringApplication.run(PetstoreApplication.class, args);
		System.out.println("*End Main*");

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			//AnimalDao animalDao = ctx.getBean(AnimalDao.class);
//
//			List<Animal> animals = controller.findAll();
//			System.out.println(animals);
//			Animal animal = animalDao.findPet(10);
//			animal.talk("Nader  is not an animal");
//			animal.eat();
			Animal animal = controller.findById(42);
			if (animal != null) {
				animal.eat();
			}
			else {
				System.out.println("No animals found");
			}


			List<Animal> animals = controller.findAll();

			if (animals.size() > 0) {
				System.out.println("### Animals: "+ animals);
			}
			else {
				System.out.println("No animals found");
			}
			//animal.eat();


			//---------------------------------
			//create a new animal
			System.out.println("Pre add number of animals " + animals.size());
			controller.add(new Cat("Bob"));

			animals = controller.findAll();
			System.out.println("Post add number of animals " + animals.size());

		};
	}
}
