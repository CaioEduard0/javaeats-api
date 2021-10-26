package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.State;
import com.example.javaeatsapi.domain.repository.StateRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StateRepositoryImpl implements StateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<State> findAll() {
        return entityManager.createQuery("select s from State s", State.class).getResultList();
    }

    @Override
    public State find(Long id) {
        return entityManager.find(State.class, id);
    }

    @Override
    public State save(State state) {
        return entityManager.merge(state);
    }

    @Override
    public void delete(State state) {
        entityManager.remove(state);
    }
}
