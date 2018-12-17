package com.codekul.demoShopping.repository;

import com.codekul.demoShopping.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer,Integer>
{

    Customer findByName(String name);
}
