package com.example.petclinicproject.bootstrap;

import com.example.petclinicproject.model.*;
import com.example.petclinicproject.services.OwnerServices;
import com.example.petclinicproject.services.PetTypeService;
import com.example.petclinicproject.services.SpecialitiesService;
import com.example.petclinicproject.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;
    public DataLoader(OwnerServices ownerServices, VetServices vetServices, PetTypeService petTypeService, SpecialitiesService specialitiesService) {

        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count =petTypeService.findAll().size();
        if (count==0)
        {loadData();}

    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Speciality radialogy=new Speciality();
        radialogy.setDescription("Radialogy");
        Speciality savedRadialogy = specialitiesService.save(radialogy);

        Speciality surgery=new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedsurgry = specialitiesService.save(surgery);

        Speciality dentistry=new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialitiesService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("fady");
        owner1.setLastNamem("Ramsis");
        owner1.setAddress("miami");
        owner1.setCity("newyork");
        owner1.setTelephone("212348789");
        ownerServices.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("david");
        owner2.setLastNamem("Ramsis");
        owner2.setAddress("san andreas");
        owner2.setCity("paris");
        owner2.setTelephone("7875646");
        ownerServices.save(owner2);

        Pet mika = new Pet();
        mika.setPetType(savedCatPetType);
        mika.setBirthdate(LocalDate.now());
        mika.setOwner(owner2);
        mika.setName("mika");
        owner2.getPets().add(mika);

        Pet doga = new Pet();
        mika.setPetType(savedDogPetType);
        mika.setBirthdate(LocalDate.now());
        mika.setOwner(owner1);
        mika.setName("Doga");
        owner1.getPets().add(doga);

        Vet vet1 = new Vet();
        vet1.setFirstName("ano");
        vet1.setLastNamem("ashraf");
        vetServices.save(vet1);
        vet1.getSpecialities().add(savedRadialogy);

        Vet vet2 = new Vet();
        vet2.setFirstName("mina");
        vet2.setLastNamem("ashraf");
        vetServices.save(vet2);
        vet2.getSpecialities().add(savedsurgry);
    }
}
