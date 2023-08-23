package com.yuzarsif.searchrestapi.service;

import com.yuzarsif.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
