package com.example.demo.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException (Integer id){
        super("Customer not found with id " + id );
    }
}
