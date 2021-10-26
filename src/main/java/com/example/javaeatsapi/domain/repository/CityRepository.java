package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.City;

import java.util.List;

public interface CityRepository {

    List<City> findAll();

    City find(Long id);

    City save(City city);

    void delete(City city);
}
