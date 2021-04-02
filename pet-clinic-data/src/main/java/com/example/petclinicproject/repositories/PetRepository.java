package com.example.petclinicproject.repositories;

import com.example.petclinicproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
