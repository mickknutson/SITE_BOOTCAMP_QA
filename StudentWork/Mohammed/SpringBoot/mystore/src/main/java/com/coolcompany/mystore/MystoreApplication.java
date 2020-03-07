package com.coolcompany.mystore;

import com.coolcompany.mystore.controller.ItemController;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MystoreApplication {
	@Autowired
	private ItemController itemController;

	public static void main(String[] args) {
		System.out.println(" $ $ $ $ $ $ $ Start Spring Boot $ $ $ $ $ $ $ ");
		SpringApplication.run(MystoreApplication.class, args);
		System.out.println(" $ $ $ $ $ $ $ End Spring Boot $ $ $ $ $ $ $ ");

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			// Add
			Item item1 = new Item("IPhone" , "New Phone" , 750);
			Item item2 = new Item("TV", " LG TV" , 1200);
			Item item3 = new Item("Video Game" , "FIFA19",60);
			System.out.println(" @ @ @ @  Add 3 items @ @ @ @");

			itemController.addItem(item1);
			itemController.addItem(item2);
			itemController.addItem(item3);

			System.out.println(" @ @ @ @  List all items @ @ @ @");
			List<Item> itemList = new ArrayList<>();
			itemList = itemController.findAll();
			System.out.println(" Items : "  + itemList);

			System.out.println(" @ @ @ @  Update item #1 Name @ @ @ @");
			itemController.updateName(item1,"Nokia");

			System.out.println(" @ @ @ @  List all items @ @ @ @");
			itemList = itemController.findAll();
			System.out.println(" Items : "  + itemList);

			System.out.println(" @ @ @ @  Delete  item #2 @ @ @ @");
			itemController.deleteItemById(2);

			System.out.println(" @ @ @ @  List all items @ @ @ @");
			itemList = itemController.findAll();
			System.out.println(" Items : "  + itemList);

		};
	}

}
