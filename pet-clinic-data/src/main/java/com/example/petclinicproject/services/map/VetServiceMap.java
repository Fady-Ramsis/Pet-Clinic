package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Vet;
import com.example.petclinicproject.services.VetServices;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetServices {

    @Override
    public Set<Vet> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
