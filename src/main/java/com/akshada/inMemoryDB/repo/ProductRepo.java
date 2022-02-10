package com.akshada.inMemoryDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshada.inMemoryDB.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
