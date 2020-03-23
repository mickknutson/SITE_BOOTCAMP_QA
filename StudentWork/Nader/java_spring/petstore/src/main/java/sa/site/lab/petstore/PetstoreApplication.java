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

//			List<Animal> animals = controller.findAll();
//			System.out.println("##Animals: " +animals);

			System.out.println("End commandLine Runner");
		};
	}
}
