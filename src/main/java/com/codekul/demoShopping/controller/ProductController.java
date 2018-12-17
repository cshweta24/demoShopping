package com.codekul.demoShopping.controller;

import com.codekul.demoShopping.domain.Product;
import com.codekul.demoShopping.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @PostMapping(value = "/saveProduct")
    public String saveProduct(@RequestBody Product product)
    {
        productRepo.save(product);
        return "successful";
    }

    @GetMapping(value = "findByPid")
    public Product findByPid(@RequestParam Integer pid)
    {
        Product product=productRepo.findOne(pid);
        return product;
    }


    @GetMapping(value = "findByName")
    public Product findByName(@RequestParam String name)
    {
      Product product=productRepo.findByName(name);
      return product;
    }

}
