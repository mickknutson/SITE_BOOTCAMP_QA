package sa.site.lab.petstore;

import org.hibernate.boot.model.source.spi.SingularAttributeSourceToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;
import sa.site.lab.petstore.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PetstoreApplication { // BEGINING OF CLASS ..

//	@Autowired
//	private AnimalDao dao;

	@Autowired
	private AnimalController controller;

	@Autowired
	private Animal animal;

	public static void main(String[] args) { // START OF main Method ..
		SpringApplication.run(PetstoreApplication.class, args);
	} // END OF main METHOD ..

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			// Runnable code goes here
			System.out.println("<<<<<<<<<<<>>>>>>>>>>> Spring command RUNNER!! <<<<<<<<<<<>>>>>>>>>>>>");

			// Add animals ..
			controller.addAnimal(animal);
			controller.addAnimal(animal);
			controller.addAnimal(animal);

			// Get all animals ..
			List<Animal> animals = controller.findAll();

			//Print size of list :
			System.out.println("///////////////////////// Printing List Size ///////////////////////////////");
			System.out.println(animals.size());

			// Print all animals :
			System.out.println("///////////////////////// Printing all animals ///////////////////////////////");
			for (int i = 0 ; i< animals.size(); i ++){
				System.out.println("Animal #" + i + " , " + animals.get(i));
			}


		};
	}

	private void testMethod() {
		//System.out.println("<<<<<<<<<<<>>>>>>>>>>> Animal output : <<<<<<<<<<>>>>>>>>>>>>");
		// Map<String,Object>
		// BY name (key)
		//AnimalDao dao1 = (AnimalDao) ctx.getBean("animalDao");
		// BY type (value)
		//AnimalDao dao = ctx.getBean(AnimalDao.class);

		Animal animal = controller.findPet(1);
		animal.eat();
	}

	public List<Animal> addRetriveAnimals (){

		List<Animal> animalsList = new ArrayList<>();

		// CATS ..
		Animal cat1 = new Cat("CAT #1");
		animalsList.add(cat1);

		Animal cat2 = new Cat("CAT #2");
		animalsList.add(cat2);

		Animal cat3 = new Cat("CAT #3");
		animalsList.add(cat3);



		//DOGS ..
		Animal dog1 = new Dog("DOG #1");
		animalsList.add(dog1);

		Animal dog2 = new Dog("DOG #2");
		animalsList.add(dog2);

		Animal dog3 = new Dog("DOG #3");
		animalsList.add(dog3);

		return animalsList;


	}

} //  END OF CLASS ..

// Create a list of animals .. then return that list of animals
