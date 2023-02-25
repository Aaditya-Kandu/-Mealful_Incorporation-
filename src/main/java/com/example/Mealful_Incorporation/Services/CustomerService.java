package com.example.Mealful_Incorporation.Services;

import com.example.Mealful_Incorporation.Entities.CustomerEntity;
import com.example.Mealful_Incorporation.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    // Here we use concept of Singleton. It means in whole project there are only one object in IOC container

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(CustomerEntity customerEntity){

        customerRepository.save(customerEntity);

        return "Customer Added Successfully";
    }


}
