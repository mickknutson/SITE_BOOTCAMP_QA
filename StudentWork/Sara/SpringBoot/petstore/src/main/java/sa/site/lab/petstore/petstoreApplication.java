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
	private AnimalController controller;

	public static void main(String[] args) {

		System.out.println("* Start Main()");

		SpringApplication.run(PetstoreApplication.class, args);

		System.out.println("* End Main()");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	{
		return args ->
		{
			// Runnable Code Will be Here ...
			System.out.println("### Start Command Runner ###");
			System.out.println("### Animal Dao output is : ###");

			// Map<String,Object> context ...
			// so you either get a map item either by its key (name) or the value (object) itself

//		 AnimalDao daoObject = ctx.getBean(AnimalDao.class);
//         AnimalDao daoByName = (AnimalDao) ctx.getBean("animalDao");

//			Animal animal = dao.findPet(2);

			Animal animal = controller.findPet(1);

			List<Animal> animals = controller.findAll();
			System.out.println("### Animals: "+ animals);
			if(animals != null) {
				for (int i = 0; i < animals.size(); i++)
					animals.get(i).eat();
			}else{
				System.out.println("No Animals found");
			}
				if(animal != null) {
		    	animal.eat();}
				else{
						System.out.println("No Animals found");
					}

			System.out.println("### End Command Runner ###");
		};


	}
}
