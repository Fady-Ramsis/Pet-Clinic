package com.example.petclinicproject.bootstrap;

import com.example.petclinicproject.model.Owner;
import com.example.petclinicproject.model.PetType;
import com.example.petclinicproject.model.Vet;
import com.example.petclinicproject.services.OwnerServices;
import com.example.petclinicproject.services.PetTypeService;
import com.example.petclinicproject.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;
    private final PetTypeService petTypeService;
    public DataLoader(OwnerServices ownerServices, VetServices vetServices, PetTypeService petTypeService) {

        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        dog.setName("dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("fady");
        owner1.setLastNamem("Ramsis");
        ownerServices.save(owner1);

        Owner owner2 = new Owner();
        owner1.setFirstName("david");
        owner1.setLastNamem("Ramsis");
        ownerServices.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("ano");
        vet1.setLastNamem("ashraf");
        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet1.setFirstName("mina");
        vet1.setLastNamem("ashraf");
        vetServices.save(vet2);

    }
}
