package com.example.petclinicproject.bootstrap;

import com.example.petclinicproject.model.*;
import com.example.petclinicproject.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices ;
    private final VetServices vetServices;

    public DataLoader(OwnerServices ownerServices, VetServices vetServices) {

        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
    }

    @Override
    public void run(String... args) throws Exception {
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
