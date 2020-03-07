package com.coolcompany.mystore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
class MystoreApplicationTests {

	public static void main(String[] args) { // START OF main Method ..
		System.out.println("Start Main ....................................");
		SpringApplication.run(MystoreApplicationTests.class, args);
		System.out.println("End Main ........................................");
	} // END OF main METHOD ..

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

		};
	}
}
