package sa.site.lab.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;

@SpringBootApplication
public class PetstoreApplication
{

	// Only fields(methods) / Variables go here ...


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

			AnimalDao dao = ctx.getBean(AnimalDao.class);
			Animal animal = dao.findPet(2);
			animal.eat();
		};


	}
}

