package com.elearn.service.impl;

import com.elearn.model.Customer;
import com.elearn.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerServiceImpl implements CustomerService {

    public static List<Customer> customers = new ArrayList<>();

    private static final AtomicInteger count = new AtomicInteger(0);

    public CustomerServiceImpl() {
        Customer customer = new Customer("Prad", 3);
        customer.setId(count.incrementAndGet());
        customers.add(customer);
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer update(Customer customer) {
        int indexOf = customers.indexOf(customer);
        customers.set(indexOf, customer);
        return customer;
    }

    @Override
    public void delete(Integer id) {
        Customer customer = get(id);
        customers.remove(customer);
    }

    @Override
    public Customer get(Integer id) {
        for (Customer customer: customers) {
            if(customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
