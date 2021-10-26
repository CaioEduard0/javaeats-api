package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    List<Restaurant> findAll();

    Restaurant find(Long id);

    Restaurant save(Restaurant restaurant);

    void delete(Restaurant restaurant);
}
