package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.PetType;
import com.example.petclinicproject.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType,Long>implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long id) {
              super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
           super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
