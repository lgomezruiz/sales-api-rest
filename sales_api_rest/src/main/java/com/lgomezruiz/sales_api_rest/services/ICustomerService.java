package com.lgomezruiz.sales_api_rest.services;

import com.lgomezruiz.sales_api_rest.models.CustomerModel;

import java.util.List;

public interface ICustomerService {

    //Create One Customer
    CustomerModel createCustomer(CustomerModel customer);

    //Get All Customers
    List<CustomerModel> getAllCustomers();

    //Get One Customer
    CustomerModel getCustomer(Long id);

    //Delete One Customer
    void deleteCustomer(Long id);

    //Update One Customer
    CustomerModel updateCustomer(CustomerModel customer);

}
