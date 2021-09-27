package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductConData {

    @Autowired
    private ProductService service;

    @PostMapping("/add")
    public Product addData(@RequestBody Product product) {
        return service.add(product);
    }
    @PostMapping("/addAll")
    public List<Product> addAllData(@RequestBody List<Product> products) {
        return service.addAll(products);
    }
    @GetMapping("user/{id}")
    public Product getUsers(@PathVariable int id) {
            return service.get(id);
    }
//    @GetMapping("user/{name}")
//    public Product getName(@PathVariable String name) {
//        return service.(name);
//    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
         return service.delete(id);
    }


}
