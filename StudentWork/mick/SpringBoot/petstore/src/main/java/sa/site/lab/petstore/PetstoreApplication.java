package sa.site.lab.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;

@SpringBootApplication
public class PetstoreApplication{

    // Only Fields / Variables go here...

	public static void main(String[] args) { // Start of MAIN method
		SpringApplication.run(PetstoreApplication.class, args);
	} // End of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("*** Spring Command Runner ***");
            System.out.println("*** Animal DAO output: ***");

            //AnimalDao dao = new AnimalDao();
            AnimaDao dao = ctx.getBean(AnimalDao.class);

            Animal animal = dao.findPet(1);
            animal.eat();

            // Animal DAO Goes here
        };
    }

} // End of Class
