package com.example.petclinicproject.repositories;

import com.example.petclinicproject.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
