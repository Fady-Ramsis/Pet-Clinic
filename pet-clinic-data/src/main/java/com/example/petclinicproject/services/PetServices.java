package com.example.petclinicproject.services;


import com.example.petclinicproject.model.Pet;

import java.util.Set;

public interface PetServices {
    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();
}
