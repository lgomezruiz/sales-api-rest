package com.lgomezruiz.sales_api_rest.services;

import com.lgomezruiz.sales_api_rest.models.CustomerModel;
import com.lgomezruiz.sales_api_rest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public CustomerModel createCustomer(CustomerModel customer) {
        return repository.save(customer);
    }

    @Override
    public List<CustomerModel> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public CustomerModel getCustomer(Long id) {
        Optional<CustomerModel> customerOptional = repository.findById(id);
        return customerOptional.orElse(null);
    }

    @Override
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CustomerModel updateCustomer(CustomerModel customer) {
        return repository.save(customer);
    }
}
