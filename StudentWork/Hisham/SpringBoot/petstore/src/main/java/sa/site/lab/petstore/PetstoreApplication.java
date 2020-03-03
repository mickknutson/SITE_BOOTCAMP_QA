package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

@SpringBootApplication
public class PetstoreApplication
{

	// Only fields(methods) / Variables go here ...
//	@Autowired
//	private AnimalDao dao;

	@Autowired
	private AnimalService service;


	public static void main(String[] args)
	{
		SpringApplication.run(PetstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	{
		return args ->
		{
			// Runnable Code Will be Here ...
			System.out.println("### Command Runner ###");
			System.out.println("### Animal Dao output is : ###");

			// Map<String,Object> context ...
			// so you either get a map item either by its key (name) or the value (object) itself

//		 AnimalDao daoObject = ctx.getBean(AnimalDao.class);
//         AnimalDao daoByName = (AnimalDao) ctx.getBean("animalDao");

//			Animal animal = dao.findPet(2);
			Animal animal = service.findPet(2);

			animal.eat();
		};


	}
}

