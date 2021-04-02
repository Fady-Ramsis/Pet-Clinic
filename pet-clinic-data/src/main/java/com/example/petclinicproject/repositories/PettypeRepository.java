package com.example.petclinicproject.repositories;

import com.example.petclinicproject.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PettypeRepository extends CrudRepository<PetType,Long> {
}
