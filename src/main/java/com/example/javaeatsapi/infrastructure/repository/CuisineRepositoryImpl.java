package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.Cuisine;
import com.example.javaeatsapi.domain.repository.CuisineRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CuisineRepositoryImpl implements CuisineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cuisine> findAll() {
        return entityManager.createQuery("select c from Cuisine c", Cuisine.class).getResultList();
    }

    @Override
    public Cuisine find(Long id) {
        return entityManager.find(Cuisine.class, id);
    }

    @Override
    public Cuisine save(Cuisine cuisine) {
        return entityManager.merge(cuisine);
    }

    @Override
    public void delete(Cuisine cuisine) {
        entityManager.remove(cuisine);
    }
}
