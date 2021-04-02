package com.example.petclinicproject.services.map;

import com.example.petclinicproject.model.Owner;
import com.example.petclinicproject.model.Pet;
import com.example.petclinicproject.services.OwnerServices;
import com.example.petclinicproject.services.PetServices;
import com.example.petclinicproject.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerServices {
    private final PetTypeService petTypeService;
    private final PetServices petServices;

    public OwnerServiceMap(PetTypeService petTypeService, PetServices petServices) {
        this.petTypeService = petTypeService;
        this.petServices = petServices;
    }

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
        if(object!= null){
            if (object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType()!=null){
                        if (pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId()==null){
                        Pet savedPet= petServices.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }
    }

    @Override
    public void deleteById(Long id) {
          super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return findByLastName(lastName);
    }
}
