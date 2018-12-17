package com.codekul.demoShopping.repository;

import com.codekul.demoShopping.domain.Cart;
import com.codekul.demoShopping.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Customer,Integer>

{
    void save(Cart cart);
}
