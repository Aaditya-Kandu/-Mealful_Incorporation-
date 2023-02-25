package com.example.Mealful_Incorporation.Entities;

import com.example.Mealful_Incorporation.Enums.Slot;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class CustomerEntity {

    // In the table we generate Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // It is used to allocate automatic value that is Unique and order
    private int id;

    @Timestamp    // Create real time: Time automatic
    private Time schedule_Time;

    @Enumerated(value = EnumType.STRING)
     private Slot slot;

    @Timestamp  // Create real time date automatic when customer add
    private Data item_Date;

    // when we use annotation that create automatic entity then we no need to pass in postman
}
