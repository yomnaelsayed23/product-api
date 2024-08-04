package com.example.product_api.controller;

import com.example.product_api.entity.Product;
import com.example.product_api.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestController {

  @Autowired
  ProductRepo productRepo ;

  @GetMapping("/products")
  public List<Product> getProducts(){
    return productRepo.findAll();
  }

  @GetMapping("/products/{id}")
  public Product getProduct(@PathVariable("id") long id){
    return productRepo.findById(id).get();
  }

  @PostMapping("/products")
  public Product createProduct(@RequestBody Product product){
    return productRepo.save(product);
  }


  @PutMapping("/products")
  public Product updateProduct(@RequestBody Product product){
    return productRepo.save(product);
  }

  @DeleteMapping("/products/{id}")
  public void deleteProduct(@PathVariable("id") long id){
    productRepo.deleteById(id);
  }
}
