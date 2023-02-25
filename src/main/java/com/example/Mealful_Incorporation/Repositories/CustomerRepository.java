package com.example.Mealful_Incorporation.Repositories;

import com.example.Mealful_Incorporation.Entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

    // It is repository layer. This layer interact with Database;
    // Here come logic of Hibernate and JPA are responsible for interact with databases and execute query

}
