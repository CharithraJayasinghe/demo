package com.example.demo.model;

import jakarta.persistence.*;

@Entity               //create table when applicaton connect with the springboot back end
public class Customer {

    @Id              //this annotation define the primary key of the table.
    @GeneratedValue //this makes id auto inrement.
    private int id;
    private String name;
    private String email;
    private String shipping_address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }
}
