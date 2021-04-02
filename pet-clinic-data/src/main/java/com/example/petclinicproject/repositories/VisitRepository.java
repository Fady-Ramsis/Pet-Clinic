package com.example.petclinicproject.repositories;

import com.example.petclinicproject.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
