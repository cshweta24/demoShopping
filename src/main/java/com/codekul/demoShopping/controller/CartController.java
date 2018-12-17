package com.codekul.demoShopping.controller;


import com.codekul.demoShopping.domain.Cart;
import com.codekul.demoShopping.repository.CartRepo;
import com.codekul.demoShopping.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CartRepo cartRepo;


    @RequestMapping(value = "/saveCart")
    public String saveCart(@RequestBody Cart cart)
    {
    cartRepo.save(cart);
    return "success";
    }

}
