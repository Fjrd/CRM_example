package com.example.fjrd.crm_example.repositories;

import com.example.fjrd.crm_example.model.Customer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>,
                                            JpaSpecificationExecutor<Customer> {
}
