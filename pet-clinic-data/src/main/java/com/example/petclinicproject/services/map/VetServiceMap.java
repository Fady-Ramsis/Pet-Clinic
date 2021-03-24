package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Speciality;
import com.example.petclinicproject.model.Vet;
import com.example.petclinicproject.services.SpecialitiesService;
import com.example.petclinicproject.services.VetServices;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.function.Consumer;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetServices {
    private final SpecialitiesService specialitiesService;

    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

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
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpecialty = specialitiesService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

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
