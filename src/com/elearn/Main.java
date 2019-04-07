package com.elearn;

import com.elearn.model.Customer;
import com.elearn.service.CustomerService;
import com.elearn.service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        displayOption();
    }

    public static void displayOption() {
        Scanner sc = new Scanner(System.in);
        String Option;

        CustomerService customerService = new CustomerServiceImpl();

        // Display options
        System.out.println("*****************************************");
        System.out.println("|   HOTEL MANAGEMENT SYSTEM             |");
        System.out.println("*****************************************");
        System.out.println("| Options:                              |");
        System.out.println("|        1. Add New Customer            |");
        System.out.println("|        2. View All Customer           |");
        System.out.println("|        3. Search For Customer         |");
        System.out.println("|        4. Check Out                   |");
        System.out.println("|        5. Update Customer Data        |");
        System.out.println("|        6. Exit                        |");
        System.out.println("*****************************************");

        System.out.print("Select option: ");

        Option = sc.next();

        //options to select from
        switch (Option) {
            case "1":
                //AddCustomer add = new AddCustomer();
                System.out.println("Enter Customer Details");
                System.out.println("======================================");
                Customer customer = new Customer();
                System.out.println("Enter name: ");
                customer.setName(sc.next());
                System.out.println("Enter age: ");
                customer.setAge(sc.nextInt());

                customerService.add(customer);
                break;
            case "2":
                //ViewList view = new ViewList();
                System.out.println("Customers");
                customerService.findAll().forEach(customerFromDb -> {
                    System.out.println("Name: " + customerFromDb.getName());
                    System.out.println("Age: "+ customerFromDb.getAge());
                });
                break;
            case "3":
                //SearchCustomer search = new SearchCustomer();
                break;
            case "4":
                //CheckOut checkout = new CheckOut();
                break;
            case "5":
                //UpdateCustomer update = new UpdateCustomer();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Selection Incorrect");
                break;
        }
        sc.close();

    }
}
