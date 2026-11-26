package com.fdm.repository;

// From database:
//  - Save customer
//  - Find customer
//  - Delete customer

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdm.entity.Customer;

public interface CustomerRepository
        extends JpaRepository<Customer, Long>{
}
