package com.labs.springstarted.controller;

import com.labs.springstarted.model.Contact;
import com.labs.springstarted.model.Customer;
import com.labs.springstarted.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/demo")
public class MainController {
  @Autowired
  private CustomerRepository customerRepository;

  @RequestMapping(path = "/customers", method = RequestMethod.GET)
  public ResponseEntity<Iterable<Customer>> getCustomers() {
    return ResponseEntity.ok(customerRepository.findAll());
  }

  @RequestMapping(path = "/customers/{customerId}/contacts/", method = RequestMethod.GET)
  public List<Contact> getCustomerContacts(@PathVariable("customerId") Long customerId) {
    return customerRepository.findById(customerId).get().getContacts();
  }
}
