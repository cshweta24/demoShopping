package com.codekul.demoShopping.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
    public void setName(String name) {
        this.name = name;
    }

    @Id
    private Integer id;
    private  String name;
    private  String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
