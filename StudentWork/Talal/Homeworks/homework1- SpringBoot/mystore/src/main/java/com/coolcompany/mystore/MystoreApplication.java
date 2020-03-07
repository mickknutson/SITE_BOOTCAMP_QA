package com.coolcompany.mystore;

import com.coolcompany.mystore.dao.ItemDaoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MystoreApplication {

	@Autowired
	private ItemDaoDatabase daoDatabase;

	public static void main(String[] args)
	{
		SpringApplication.run(MystoreApplication.class, args);


	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println(" Start of CommandLineRunner ");

			System.out.println("Add new Item");
			Item item1= new Item("collars","training collars",40);
			Item item2= new Item("bed","pet beds including cooling and heated beds",150);
			Item item3= new Item("Kennels","pets Kennels",500);
			Item item4= new Item("Door","dog and cat door",300);

			daoDatabase.add(item1);
			daoDatabase.add(item2);
			daoDatabase.add(item3);
			daoDatabase.add(item4);
			Item  test =daoDatabase.findById(1);
			if(test!=null){
				System.out.println(test.toString());
			}
			System.out.println("End of CommandLineRunner");




		};
	}


}
