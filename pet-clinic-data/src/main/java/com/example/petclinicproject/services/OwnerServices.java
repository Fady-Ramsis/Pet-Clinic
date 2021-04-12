package com.example.petclinicproject.services;

import com.example.petclinicproject.model.Owner;

import java.util.List;


public interface OwnerServices extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
    List<Owner> findByLastNameLike(String lastName);

}
