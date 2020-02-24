package com.labs.springstarted.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "agency")
@NoArgsConstructor
@ToString()
@EqualsAndHashCode()
public class Agency implements Identifiable<Long>, Serializable {

  private static final long serialVersionUID = 6388840027649842107L;

  @Id
  @Column(name = "agency_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "sales_force_account_id")
  private String salesForceAccountId;

  @Column(name = "name")
  private String name;

  @Column(name = "market")
  private String market;

  @Column(name = "unity_id")
  private Long unityId;

}
