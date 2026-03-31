package com.binotto.stock.service;

import com.binotto.stock.model.Product;
import com.binotto.stock.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Repository productRepository;

    public Product save (Product p) {
        return productRepository.save(p);
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }
}