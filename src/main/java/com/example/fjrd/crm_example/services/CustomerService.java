package com.example.fjrd.crm_example.services;

import com.example.fjrd.crm_example.model.Customer;
import com.example.fjrd.crm_example.repositories.CustomerRepository;
import com.example.fjrd.crm_example.specifications.CustomerDatatableFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Page<Customer> getCustomersForDatatable(String queryString, Pageable pageable){
        CustomerDatatableFilter customerDatatableFilter = new CustomerDatatableFilter(queryString);
        return customerRepository.findAll(customerDatatableFilter, pageable);
    }
}
