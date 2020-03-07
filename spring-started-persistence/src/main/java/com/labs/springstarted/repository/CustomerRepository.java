package com.labs.springstarted.repository;

import com.labs.springstarted.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
