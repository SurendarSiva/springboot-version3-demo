package com.javatechie.versionthree.controller;

import com.javatechie.versionthree.dto.Customer;
import com.javatechie.versionthree.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCust")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/getAllCust")
    public List<Customer> getCustomerList(){
        return customerService.getCustomerList();
    }

    @GetMapping("/getCust/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }
}
