package com.labs.springstarted.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @JsonIgnore
  @OneToMany(mappedBy = "customer")
  private List<Contact> contacts;
}
