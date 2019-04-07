package com.elearn.service.impl;

import com.elearn.model.Customer;
import com.elearn.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    @Override
    public void add(Customer customer) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Customer get(Integer id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer("Meha", 31);
        customer.setId(1);
        customers.add(customer);
        return customers;
    }
}
