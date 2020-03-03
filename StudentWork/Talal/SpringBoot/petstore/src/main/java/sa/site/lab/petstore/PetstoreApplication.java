package sa.site.lab.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.dao.AnimalDao;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(PetstoreApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println(" >>> test test!! <<<<");
			System.out.println(" <>**** Animal DAO output: ****<>");
			AnimalDao dao = ctx.getBean(AnimalDao.class);
			Animal animal=dao.findPet(1);
			animal.eat();
		};
	}

}
