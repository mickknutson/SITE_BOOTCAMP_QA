package com.coolcompany.mystore;

import com.coolcompany.mystore.controller.ItemController;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MystoreApplication {
	@Autowired
	private ItemController controller;

	public static void main(String[] args) {
		System.out.println("* start main()");
		SpringApplication.run(MystoreApplication.class, args);
		System.out.println("* end main()");
	} // end of MAIN method

	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {
			System.out.println(" ** Start CommandLine Runner **");

			System.out.println(" ** Add Items **");
			Item item1 = new Item("iphon","mobile",1500);
			Item item2 = new Item("galaxy","mobile",1000);
			Item item3 = new Item("dell","laptop",3500);
			controller.add(item1);
			controller.add(item2);
			controller.add(item3);




		};
	}
} //end of Class
