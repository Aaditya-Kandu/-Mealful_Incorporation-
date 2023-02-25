package com.example.Mealful_Incorporation.Controllers;

import com.example.Mealful_Incorporation.Entities.CustomerEntity;
import com.example.Mealful_Incorporation.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add_customer")
    public String addCustomer(@RequestBody()CustomerEntity customerEntity){

        return customerService.addCustomer(customerEntity);
    }
}
