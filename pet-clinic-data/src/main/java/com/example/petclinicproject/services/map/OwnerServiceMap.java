package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Owner;
import com.example.petclinicproject.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Owner object) {
           super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
          super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
