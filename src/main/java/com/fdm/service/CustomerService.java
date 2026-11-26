package com.fdm.service;

import com.fdm.dto.CreateCustomerRequest;
import com.fdm.dto.CustomerResponse;
import com.fdm.repository.CustomerRepository;

// Creates entities
// Handles  transactions
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public CustomerResponse createCustomer(
            CreateCustomerRequest request){

        //Use customerRepository for storing customer
        return null;
    }

    public void deleteCustomer(Long customerId){

        //Use customerRepository for deleting customer
    }


}
