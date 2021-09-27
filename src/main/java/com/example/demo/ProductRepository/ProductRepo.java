package com.example.demo.ProductRepository;

import com.example.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product finByName(String name);
}
