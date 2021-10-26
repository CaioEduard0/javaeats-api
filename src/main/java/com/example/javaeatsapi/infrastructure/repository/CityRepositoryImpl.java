package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.City;
import com.example.javaeatsapi.domain.repository.CityRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<City> findAll() {
        return entityManager.createQuery("select c from City c", City.class).getResultList();
    }

    @Override
    public City find(Long id) {
        return entityManager.find(City.class, id);
    }

    @Override
    public City save(City city) {
        return entityManager.merge(city);
    }

    @Override
    public void delete(City city) {
        entityManager.remove(city);
    }
}
