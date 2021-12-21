package com.udacity.restappi.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String Name;
    String Breed;
    String Origin;

    public Dog(Long id, String Name, String Breed, String Origin) {
        this.id = id;
        this.Name = Name;
        this.Breed = Breed;
        this.Origin = Origin;
    }

    public Dog(Long id) {
        this.id = id;
    }

    public Dog(String Name, String Breed, String Origin) {
        this.Name = Name;
        this.Breed = Breed;
        this.Origin = Origin;
    }

    public Dog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    
}
