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

			System.out.println("Start commandLine Runner");
			System.out.println("Add new Dog: ");
			Animal dog = new Animal();


			dog.setName("Fidgo Dog");
			dog.setSound("Whooooaaaw");
			dog.setType("DOG"); // DOG , CAT
			Animal animal2 = controller.findById(1);
			if (animal2 == null){
				System.out.println("###  animal is null");
			}

			controller.add(dog);
			Animal animal1 = controller.findById(1);
			if (animal1 == null){
				System.out.println("###  animal is null");
			}
			else {
				System.out.println("## Animal: " + animal1.getName());
			}

			System.out.println("End commandLine Runner");
		};
	}
}
