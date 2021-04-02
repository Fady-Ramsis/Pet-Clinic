package com.example.petclinicproject.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity{
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastNamem;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamem() {
        return lastNamem;
    }

    public void setLastNamem(String lastNamem) {
        this.lastNamem = lastNamem;
    }
}
