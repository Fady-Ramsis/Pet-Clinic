package com.example.petclinicproject.repositories;

import com.example.petclinicproject.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
   // Owner findByLastName(String lastName);
   List<Owner> findByLastNameLike(String lastName);
}
