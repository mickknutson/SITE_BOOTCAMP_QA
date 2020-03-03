package sa.site.lab.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;

@SpringBootApplication
public class PetstoreApplication { // BEGINING OF CLASS ..

	public static void main(String[] args) { // START OF main Method ..
		SpringApplication.run(PetstoreApplication.class, args);
	} // END OF main METHOD ..

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			// Runnable code goes here
			System.out.println("<<<<<<<<<<<>>>>>>>>>>> Spring command RUNNER!! <<<<<<<<<<>>>>>>>>>>>>");
			System.out.println("<<<<<<<<<<<>>>>>>>>>>> Animal DAO output : <<<<<<<<<<>>>>>>>>>>>>");
			AnimalDao dao = ctx.getBean(AnimalDao.class);
			Animal animal = dao.findPet(1);
			animal.eat();
		};
	}

} //  END OF CLASS ..
