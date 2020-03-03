package sa.site.lab.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PetstoreApplication {

	// Only fields(methods) / Variables go here ...



	public static void main(String[] args) {
		System.out.println("Started");
		SpringApplication.run(PetstoreApplication.class, args);
		System.out.println("Stopped");
	}

	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx)
	{
		return args -> {
			// Runnable Code Will be Here ...
			System.out.println("Command Runner");

		};
	}

}

