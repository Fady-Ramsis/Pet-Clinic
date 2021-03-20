package com.example.petclinicproject.services;



import com.example.petclinicproject.model.Vet;

import java.util.Set;

public interface VetServices {
    Vet findById(Long id);
    Vet save (Vet vet);
    Set<Vet> findAll();
}
