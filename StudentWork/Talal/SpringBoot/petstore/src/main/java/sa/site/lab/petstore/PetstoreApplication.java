package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.Animalcontroller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.service.AnimalService;

@SpringBootApplication
public class PetstoreApplication {

	// the best way of object
	@Autowired
	private AnimalDao dao;
	@Autowired
	private AnimalService service;
	@Autowired
	private Animalcontroller controller;

	public static void main(String[] args)
	{
		SpringApplication.run(PetstoreApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println(" >>> test test!! <<<<");
			System.out.println(" <>**** Animal DAO output: ****<>");
			// BY name (key)
			//AnimalDao dao1 = (AnimalDao) ctx.getBean("AnimalDao");
			// By type (value) Best way
			//AnimalDao dao = ctx.getBean(AnimalDao.class);

			Animal animal=controller.findPet(1);
			animal.eat();
		};
	}

}
