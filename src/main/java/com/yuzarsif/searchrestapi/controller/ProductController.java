package com.yuzarsif.searchrestapi.controller;

import com.yuzarsif.searchrestapi.entity.Product;
import com.yuzarsif.searchrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
        return ResponseEntity.ok(service.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }
}
