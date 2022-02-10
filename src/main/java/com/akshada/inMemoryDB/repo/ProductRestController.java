package com.akshada.inMemoryDB.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshada.inMemoryDB.entity.Product;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepo productRepo;

	@PostMapping(value = "/product", consumes = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody  Product product) {
		productRepo.save(product);
		return new ResponseEntity<>("data saved", HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/products", produces  = "application/json")
	public ResponseEntity<List<Product>> getProduct() {
		List<Product> product = productRepo.findAll();
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
}
