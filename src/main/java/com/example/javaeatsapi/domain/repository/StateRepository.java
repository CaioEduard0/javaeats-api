package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.State;

import java.util.List;

public interface StateRepository {

    List<State> findAll();

    State find(Long id);

    State save(State state);

    void delete(State state);
}
