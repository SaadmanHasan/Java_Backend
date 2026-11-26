package com.fdm.entity;

public class Customer {

    protected long customerId;
    protected String name;
    protected Address address;

    protected Customer(){

    }

    public Customer(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public long getCustomerId() {
        return this.customerId;
    }

    public String getName(){
        return this.name;
    }

    public Address getAddress(){
        return this.address;
    }
}
