package com.codekul.demoShopping.repository;

import com.codekul.demoShopping.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product,Integer>

{

    Product findByName(String name);

}
