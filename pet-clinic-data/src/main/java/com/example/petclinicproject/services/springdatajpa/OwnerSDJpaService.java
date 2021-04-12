package com.example.petclinicproject.services.springdatajpa;

import com.example.petclinicproject.model.Owner;
import com.example.petclinicproject.repositories.OwnerRepository;
import com.example.petclinicproject.repositories.PetRepository;
import com.example.petclinicproject.repositories.PettypeRepository;
import com.example.petclinicproject.services.OwnerServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerServices {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PettypeRepository pettypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PettypeRepository pettypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.pettypeRepository = pettypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner>owners=new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
    ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
     //   Error creating bean with name 'ownerRepository' defined in com.example.petclinicproject.repositories.OwnerRepository defined in @EnableJpaRepositories
     //   declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration
        //  return ownerRepository.findByLastName(lastName);
       return null;
    }

    @Override
    public List<Owner> findByLastNameLike(String lastName) {
        return ownerRepository.findByLastNameLike(lastName);
    }
}
