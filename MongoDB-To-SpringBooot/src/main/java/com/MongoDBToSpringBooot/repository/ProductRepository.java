package com.MongoDBToSpringBooot.repository;

import com.MongoDBToSpringBooot.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {





}
