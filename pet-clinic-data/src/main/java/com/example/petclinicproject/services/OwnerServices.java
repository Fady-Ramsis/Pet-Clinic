package com.example.petclinicproject.services;

import com.example.petclinicproject.model.Owner;


public interface OwnerServices extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
