package com.codekul.demoShopping.domain;


import javax.persistence.*;

@Entity
public class Cart {

    @Id
    private Integer cartno;



    public Integer getCartno() {
        return cartno;
    }

    public void setCartno(Integer cartno) {
        this.cartno = cartno;
    }
}
