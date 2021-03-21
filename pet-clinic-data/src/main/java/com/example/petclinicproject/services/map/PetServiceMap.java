package com.example.petclinicproject.services.map;


import com.example.petclinicproject.model.Pet;
import com.example.petclinicproject.services.PetServices;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetServices {

    @Override
    public Set<Pet> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
