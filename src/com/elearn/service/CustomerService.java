package com.elearn.service;

import com.elearn.model.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomer(Integer id);
    public Customer getCustomer(Integer id);
    public List<Customer> findAllCustomers();
}
