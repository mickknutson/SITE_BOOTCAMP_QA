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
			Product item1 = new Product("Bag","Dior",50);
			Product item2 = new Product("Dress","TH",200);
			Product item3 = new Product("Bag","MK",150);
			Product item4 = new Product("Wallet","MANGO",70);
			Product item5 = new Product("Pants","H&M",99);

			List<Product> products = controller.findAll();
			System.out.println("Products" + products);
			controller.add(item1);
			controller.add(item2);
			controller.add(item3);
			controller.add(item4);
			controller.add(item5);
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
