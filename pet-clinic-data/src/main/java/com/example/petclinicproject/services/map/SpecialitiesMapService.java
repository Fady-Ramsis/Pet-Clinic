package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Speciality;
import com.example.petclinicproject.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class SpecialitiesMapService extends AbstractMapService<Speciality,Long>implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
