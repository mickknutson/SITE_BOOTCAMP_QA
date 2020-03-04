package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

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
			Animal animal = controller.findPet(42);
			if (animal != null)
			animal.eat();


			List<Animal> animals = controller.findAll();
			System.out.println("### Animals: "+ animals);

			//animal.eat();
		};
	}
}
