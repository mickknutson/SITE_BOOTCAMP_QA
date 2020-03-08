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

/**
 * TODO:
 * 1. Add ADD, DELETE functional for Thymeleaf
 * 2. Add REST Support
 *
 *
 */
@SpringBootApplication
public class PetstoreApplication{

	public static void main(String[] args) { // Start of MAIN method
		SpringApplication.run(PetstoreApplication.class, args);
	} // End of MAIN method

    // RUN THIS CODE FIRST AS TEST CODE:
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* start commandLineRunner");
            System.out.println("* sand box code only");

        };
    }

} // End of Class
