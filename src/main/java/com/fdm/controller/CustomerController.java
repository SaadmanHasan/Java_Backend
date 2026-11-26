package com.fdm.controller;

//Handles HTTP
// Reads request input
// Returns HTTP result

import com.fdm.dto.CreateCustomerRequest;
import com.fdm.dto.CustomerResponse;
import com.fdm.repository.CustomerRepository;
import com.fdm.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(
            @RequestBody CreateCustomerRequest request
    ) {
        // use customerService on the HTTP request to create
        // a customer and return a response
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(
            @PathVariable Long id
    ) {
        // use customerService on the id to delete
        // the customer and return a response
        return null;
    }


}
