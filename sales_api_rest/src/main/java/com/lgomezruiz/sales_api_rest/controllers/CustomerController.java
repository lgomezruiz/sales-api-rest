package com.lgomezruiz.sales_api_rest.controllers;

import com.lgomezruiz.sales_api_rest.models.CustomerModel;
import com.lgomezruiz.sales_api_rest.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //GET: Todos
    @GetMapping
    public ResponseEntity<List<CustomerModel>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    //GET: un cliente
    @GetMapping("/{id}")
    public ResponseEntity<CustomerModel> getCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
    }

    //POST: nuevo cliente
    @PostMapping
    public ResponseEntity<CustomerModel> createCustomer (@RequestBody CustomerModel customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
    }

    //PUT: un cliente
    @PutMapping
    public ResponseEntity<CustomerModel> updateCustomer(@RequestBody CustomerModel customer) {
        customerService.updateCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //DELETE: un cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
