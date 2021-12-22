/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udacity.restappi.example.service;

import com.udacity.restappi.example.Entity.Dog;
import java.util.List;

/**
 *
 * @author Desarrollo
 */
public interface DogService {

    List<Dog> retrieveDogs();

    List<String> retrieveDogBreed();

    String retrieveDogBreedById(Long id);

    List<String> retrieveDogNames();

}
