package com.example.fjrd.crm_example.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    /*
    @Table
    @Column
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;
    String emailAddress;
    String address;
    String city;
    String country;
    String phoneNumber;

}
