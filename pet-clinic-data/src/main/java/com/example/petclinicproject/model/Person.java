package com.example.petclinicproject.model;

public class Person extends BaseEntity{
    private String firstName;
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
