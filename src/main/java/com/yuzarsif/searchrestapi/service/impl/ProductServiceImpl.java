package com.yuzarsif.searchrestapi.service.impl;

import com.yuzarsif.searchrestapi.entity.Product;
import com.yuzarsif.searchrestapi.repository.ProductRepository;
import com.yuzarsif.searchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = repository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }
}
