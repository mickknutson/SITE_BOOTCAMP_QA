package com.coolcompany.mystore;

import com.coolcompany.mystore.controller.ItemsController;
import com.coolcompany.mystore.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MystoreApplication {

	@Autowired
	private ItemsController controller;

	public static void main(String[] args) {

	   System.out.println(" ** Start Main **");

        SpringApplication.run(MystoreApplication.class, args);

        System.out.println(" ** End Main **");}
        @Bean
		public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

			return args -> {

				System.out.println(" ** Start CommandLine Runner **");

				System.out.println("Add a new Item:");

				Items items = new Items();
				items.setName("Cartier Bracelet");
				items.setDescribtion("Mix of Gold & Dimonds ");
				items.setCost(50000);

				//_____________________________________________________________________________________//
				List<Items> items1 = controller.findAll();
				System.out.println("List of Items: "+items1);
				//_____________________________________________________________________________________//
				controller.add(items);

				//_____________________________________________________________________________________//
				Items items2 = controller.findById(1);

				if (items2 == null) {
					System.out.println("Items is NULL");
				} else {
					System.out.println("Items: " + items2.getName());
				}

				items1 =controller.findAll();
				System.out.println("List of Items: "+items);

				System.out.println(" ** End CommandLine Runner **");


			};
		}


}
