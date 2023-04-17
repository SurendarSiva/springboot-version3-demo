package com.javatechie.versionthree.service;

import com.javatechie.versionthree.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public Customer addCustomer(Customer customer){
        customerList.add(customer);
        return customer;
    }

    public List<Customer> getCustomerList(){
        return customerList;
    }

    public Customer getCustomer(int id){
        return customerList.stream()
                .filter(customer -> customer.id()==id)
                .findAny()
                .orElseThrow(()->new RuntimeException("Customer not found with given id: "+id));

    }

}
