package org.springcrudrest.config;

import org.springcrudrest.model.Product;
import org.springcrudrest.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner{
	 private final ProductRepository productRepository;
	 
	 public DataInitializer(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("Product 1", "Description 1", 100.0));
        productRepository.save(new Product("Product 2", "Description 2", 200.0));
		
	}

}
