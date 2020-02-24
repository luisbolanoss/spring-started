package com.labs.springstarted.repository;

import com.labs.springstarted.model.Agency;
import org.springframework.data.repository.CrudRepository;

public interface AgencyRepository extends CrudRepository<Agency, Long> {

}
