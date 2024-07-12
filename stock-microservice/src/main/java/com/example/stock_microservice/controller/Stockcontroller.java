package com.example.stock_microservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stock_microservice.entity.StockEntity;
import com.example.stock_microservice.repository.Stockrepository;


@Controller
@RequestMapping("/api/stock") 
public class Stockcontroller {
    
    @Autowired
    private Stockrepository stockrepository;

    public Boolean stockAvailable(@PathVariable String code){

        Optional<StockEntity> stock = stockrepository.findByCode(code);

        stock.orElseThrow(() -> new RuntimeException("Can not finde the product" + code ));

        return stock.get().getQuantity() > 0;
    }
}
