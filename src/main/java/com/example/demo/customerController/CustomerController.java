package com.example.demo.customerController;

import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/customer")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerRepo.save(newCustomer);

    }

    @DeleteMapping("/customer/{id}")
    String deleteCustomer(@PathVariable Integer id){
        if(!customerRepo.existsById(id)){
            throw new UserNotFoundException(id);
        }
        customerRepo.deleteById(id);
        return "user with id "+id+" is delete successfully";
    }

}
