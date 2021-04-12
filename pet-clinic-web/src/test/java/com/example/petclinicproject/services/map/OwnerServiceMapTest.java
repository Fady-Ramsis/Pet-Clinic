package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Owner;
import com.example.petclinicproject.services.PetServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long OwnerId = 1L;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(),new PetServiceMap());
        //lombok error
        ownerServiceMap.save(Owner.builder().id(1L).build());
    }

    @Test
    void findAll() {

        Set<Owner> ownerSet =  ownerServiceMap.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void SavedExistingId() {
        Long ownerId2=2L;
        Owner owner2 = Owner.builder().id(ownerId2).build();
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(ownerId2,savedOwner.getId());
    }

    @Test
    void deleteById() {
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(OwnerId);
        assertEquals(1,owner);
    }

    @Test
    void findByLastName() {
    }
}