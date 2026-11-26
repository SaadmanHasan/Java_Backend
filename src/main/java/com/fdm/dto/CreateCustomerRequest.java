package com.fdm.dto;

// Read and validate the input
public record CreateCustomerRequest(
        String name,
        String streetNumber,
        String postalCode,
        String city,
        String province
) {
}
