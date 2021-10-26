package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.Restaurant;
import com.example.javaeatsapi.domain.repository.RestaurantRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Restaurant> findAll() {
        return entityManager.createQuery("select r from Restaurant r", Restaurant.class).getResultList();
    }

    @Override
    public Restaurant find(Long id) {
        return entityManager.find(Restaurant.class, id);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return entityManager.merge(restaurant);
    }

    @Override
    public void delete(Restaurant restaurant) {
        entityManager.remove(restaurant);
    }
}
