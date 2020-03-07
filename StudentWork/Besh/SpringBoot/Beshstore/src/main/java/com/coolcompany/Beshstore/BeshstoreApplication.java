package com.coolcompany.Beshstore;

import com.coolcompany.Beshstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.coolcompany.Beshstore.controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BeshstoreApplication {
	@Autowired
	private ProductController controller;

	public static void main(String[] args) {// Start of Main method
		System.out.println("*** START MAIN() ***");
		SpringApplication.run(BeshstoreApplication.class, args);
		System.out.println("*** END MAIN() ***");
	}// End of Main method
	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {
			System.out.println("*** START commandLineRunner ***");
			System.out.println("*** Add new item ***");
			Product item = new Product();
			item.setName("Bag");
			item.setDesc("Dior");
			item.setPrice("$ 50");
			List<Product> products = controller.findAll();
			System.out.println("Products" + products);
			controller.add(item);
			Product product2 = controller.findById(1);
			if (product2 == null){
				System.out.println("Product is Null");
			}
			else{
				System.out.println("Product: " + product2.getName());
			}

			products = controller.findAll();
			System.out.println("Product: " + products);
			System.out.println("* End CommandLine Runner");
		};
	}
}
