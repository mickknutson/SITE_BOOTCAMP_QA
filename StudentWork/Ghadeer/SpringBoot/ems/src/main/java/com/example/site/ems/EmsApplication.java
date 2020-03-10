package com.example.site.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static java.lang.System.out;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
		out.println("**Start Main()**");
		SpringApplication.run(EmsApplication.class, args);
		out.println("**End main**");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("commanLinearRunner");
			out.println("sand box code only");
		};
	}
}


