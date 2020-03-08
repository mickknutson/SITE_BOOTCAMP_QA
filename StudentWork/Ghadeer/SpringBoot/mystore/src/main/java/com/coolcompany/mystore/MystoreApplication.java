package com.coolcompany.mystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.coolcompany.mystore.controller.ItemController;
import com.coolcompany.mystore.domain.Item;


import java.util.List;

import static java.lang.System.*;

@SpringBootApplication
public class MystoreApplication {

	//only fields/variables go here...
//    @Autowired
//private AnimalDao dao;
//    @Autowired
//    private AnimalService service;
	@Autowired
	private ItemController controller;


	public static void main(String[] args) {//start of main method
		out.println("**Start Main()**");
		SpringApplication.run(MystoreApplication.class, args);
		out.println("**End main**");


	}//end of main method

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("commanLinearRunner");
			out.println("Add a new item");
			int counter=0;
			while(counter<5) {
				Item item = new Item();
				item.setName("Item#" + counter);
				item.setDescription("Item#" + counter+"description");
				item.setCost(counter+1*1000);
				controller.add(item);
				counter++;
			}

			List<Item> items=controller.findAll();
			System.out.println("items: "+items);

			Item item1=controller.findById(1);
			if(item1==null){
				System.out.println("item is null");
			}
			//controller.add(item);
			Item item2=controller.findById(1);
			if(item2==null){
				System.out.println("item is null");
			}else{
				out.println("items: "+item2.getName());
			}
			items=controller.findAll();
			System.out.println("items: "+items);




			out.println("*End commandLineRunner");


		};
	}

}//end of class

