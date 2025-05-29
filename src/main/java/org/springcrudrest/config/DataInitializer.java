package org.springcrudrest.config;

import org.springcrudrest.model.Product;
import org.springcrudrest.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
	private final ProductRepository productRepository;

	public DataInitializer(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		productRepository.save(new Product("Sony WH-1000XM5 Wireless Headphones",
				"Industry-leading noise cancellation and crystal-clear sound.", 200.0));
		productRepository.save(new Product("Apple iPhone 14 Pro Max",
				"Latest iPhone with A16 Bionic chip and stunning Super Retina XDR display.", 1200.0));
		productRepository.save(new Product("Samsung Galaxy S23 Ultra",
				"Flagship smartphone with advanced camera features and powerful performance.", 1100.0));
		productRepository.save(new Product("Dell XPS 13 Laptop",
				"Compact and powerful laptop with InfinityEdge display and long battery life.", 1500.0));
		productRepository.save(new Product("Sony A7 IV Camera",
				"Full-frame mirrorless camera with exceptional image quality and advanced autofocus.", 2500.0));
		productRepository.save(new Product("Bose QuietComfort 45 Headphones",
				"Premium noise-cancelling headphones with superior sound quality and comfort.", 300.0));
		productRepository.save(new Product("Apple MacBook Pro 16-inch",
				"High-performance laptop with M1 Pro chip and stunning Liquid Retina XDR display.", 2500.0));

	}

}
