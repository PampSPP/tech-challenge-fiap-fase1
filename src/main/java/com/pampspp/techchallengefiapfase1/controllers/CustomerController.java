package com.pampspp.techchallengefiapfase1.controllers;

import com.pampspp.techchallengefiapfase1.entities.Customer;
import com.pampspp.techchallengefiapfase1.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> findAll() {
        List<Customer> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Customer findById(@PathVariable Long id) {
        Customer result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Customer insert(@RequestBody Customer customer) {
        Customer result = repository.save(customer);
        return result;
    }
}
