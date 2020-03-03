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
public class PetstoreApplication { // BEGINING OF CLASS ..

//	@Autowired
//	private AnimalDao dao;

	@Autowired
	private AnimalController controller;

	public static void main(String[] args) { // START OF main Method ..
		SpringApplication.run(PetstoreApplication.class, args);
	} // END OF main METHOD ..

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			// Runnable code goes here
			System.out.println("<<<<<<<<<<<>>>>>>>>>>> Spring command RUNNER!! <<<<<<<<<<<>>>>>>>>>>>>");
			//System.out.println("<<<<<<<<<<<>>>>>>>>>>> Animal output : <<<<<<<<<<>>>>>>>>>>>>");
			// Map<String,Object>
			// BY name (key)
			//AnimalDao dao1 = (AnimalDao) ctx.getBean("animalDao");
			// BY type (value)
			//AnimalDao dao = ctx.getBean(AnimalDao.class);

			Animal animal = controller.findPet(1);
			List<Animal> animals = controller.findAll();
			System.out.println("+++++++++ Aniamals : " + animals + " +++++++++++++++");
			animal.eat();
		};
	}

} //  END OF CLASS ..

// Create a list of animals .. then return that list of animals
