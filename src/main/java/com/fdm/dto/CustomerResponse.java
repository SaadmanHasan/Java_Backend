package com.fdm.dto;

//
public record CustomerResponse (
        Long customerId,
        String name,
        String streetNumber,
        String postalCode,
        String city,
        String province
){
}
