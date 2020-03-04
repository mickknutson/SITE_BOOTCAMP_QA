package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDaoImpl;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

	//only fields / variables goes here
	@Autowired
	private AnimalController controller;
	
	//System.out.print('not valid');
	public static void main(String[] args) { //start of Main method
		// all our code should goes inside main
		System.out.println("Starting Spring boot");
		SpringApplication.run(PetstoreApplication.class, args);
		System.out.println("Stopped Spring boot");
	}

	@Bean
	public CommandLineRunner CommandLineRunner(ApplicationContext ctx){
		return args -> {
			//runnable code goes here
			System.out.println("Bean is here");
			System.out.println("Animal DAO :");
            //animaldao dao= new animaldao();

            List<Animal> animals= (List<Animal>) controller.findAll();

			System.out.printf("## animals:%s%n", animals.get(0).getName());
			Animal animal = controller.findPet(1);
			animal.eat();
		};
	}


}
