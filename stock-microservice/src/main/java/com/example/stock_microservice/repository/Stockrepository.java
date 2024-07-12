package com.example.stock_microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock_microservice.entity.StockEntity;

public interface  Stockrepository extends JpaRepository<StockEntity, Long>{

    Optional<StockEntity> findByCode(String code);
    
}
