package com.example.site.ems;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class EmsApplication {
//	@Autowired
//	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}



	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("* Start CommandLineRunner *");

//			service.add(new Employee("Mohammed","aldosry",new Date(1994,12,12),"mom@gmail.com","IT",100));
			//System.out.println(service.findById(1));
			


		};
	}

}
