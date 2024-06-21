package com.example.product_microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.product_microservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{
    
}
