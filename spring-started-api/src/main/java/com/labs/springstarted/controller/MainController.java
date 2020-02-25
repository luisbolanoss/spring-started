package com.labs.springstarted.controller;

import com.labs.springstarted.model.Customer;
import com.labs.springstarted.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/demo")
public class MainController {
  @Autowired
  private CustomerRepository customerRepository;

  @GetMapping(path="/all")
  public ResponseEntity<List<Customer>> getAllUsers() {
    return ResponseEntity.ok(customerRepository.findAll());
  }
}
