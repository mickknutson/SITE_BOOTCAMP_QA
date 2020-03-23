package com.example.site.ems;

<<<<<<< Updated upstream
import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EmsApplication {
	@Autowired
	private EmployeeService service;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsApplication {
>>>>>>> Stashed changes

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}

<<<<<<< Updated upstream


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("* Start CommandLineRunner *");

//			service.add(new Employee("Mohammed","aldosry",new Date(1994,12,12),"mom@gmail.com","IT",100));
			//System.out.println(service.findById(1));
			


		};
	}

=======
>>>>>>> Stashed changes
}
