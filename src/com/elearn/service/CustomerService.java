package com.elearn.service;

import com.elearn.model.Customer;

import java.util.List;

public interface CustomerService {
    public void add(Customer customer);
    public Customer update(Customer customer);
    public void delete(Integer id);
    public Customer get(Integer id);
    public List<Customer> findAll();
}
