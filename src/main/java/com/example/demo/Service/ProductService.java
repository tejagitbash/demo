package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.ProductRepository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public Product add(Product product) {
        return repo.save(product);
    }
    public List<Product> addAll(List<Product> products) {
        return repo.saveAll(products);
    }
    public Product get(int id){
        return repo.findById(id).orElse(null);
    }
//    public Product getName(String name) {
//       return repo.finByName(name);
//    }
    public String delete(int id) {
        repo.deleteById(id);
        return "this is deleted"+id;
    }
//
//    public Product update(Product product) {
//        Product exist = repo.findById(product.getId()).orElse(null);
//        exist.setEmail(product.getEmail());
//        exist.setLocation(product.getLocation());
//        return repo.save(exist);
//
//    }


}
