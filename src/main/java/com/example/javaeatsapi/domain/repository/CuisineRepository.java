package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.Cuisine;

import java.util.List;

public interface CuisineRepository {

    List<Cuisine> findAll();

    Cuisine find(Long id);

    Cuisine save(Cuisine cuisine);

    void delete(Cuisine cuisine);
}
