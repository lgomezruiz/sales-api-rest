package com.lgomezruiz.sales_api_rest.repository;

import com.lgomezruiz.sales_api_rest.models.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
}
