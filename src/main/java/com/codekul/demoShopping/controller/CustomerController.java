package com.codekul.demoShopping.controller;


import com.codekul.demoShopping.domain.Customer;
import com.codekul.demoShopping.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value = "/saveData")
    public String saveData(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return "success";
    }



    @GetMapping(value = "findById")
    public Customer findById(@RequestParam Integer id)
    {
        Customer customer=customerRepo.findOne(id);
        return customer;
    }



    @GetMapping(value = "findByName")
    public Customer findByName(@RequestParam String name)
    {
      Customer customer=customerRepo.findByName(name);
      return customer;
    }




}
