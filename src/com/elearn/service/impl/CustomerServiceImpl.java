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
        customers.add(new Customer(count.incrementAndGet(), "Pradeep", 8));
        customers.add(new Customer(count.incrementAndGet(), "Saleem", 18));
        customers.add(new Customer(count.incrementAndGet(), "Jayaraj", 28));
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        int indexOf = customers.indexOf(customer);
        customers.set(indexOf, customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = getCustomer(id);
        customers.remove(customer);
    }

    @Override
    public Customer getCustomer(Integer id) {
        for (Customer customer: customers) {
            if(customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customers;
    }
}
