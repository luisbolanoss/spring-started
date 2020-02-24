package com.labs.springstarted.controller;

import com.labs.springstarted.model.Agency;
import com.labs.springstarted.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
  @Autowired
  private AgencyRepository agencyRepository;

  @GetMapping(path="/all")
  public @ResponseBody
  Iterable<Agency> getAllUsers() {
    return agencyRepository.findAll();
  }
}
