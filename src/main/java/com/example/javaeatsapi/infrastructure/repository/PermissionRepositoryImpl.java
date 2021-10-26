package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.Permission;
import com.example.javaeatsapi.domain.repository.PermissionRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PermissionRepositoryImpl implements PermissionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Permission> findAll() {
        return entityManager.createQuery("select p from Permission p", Permission.class).getResultList();
    }

    @Override
    public Permission find(Long id) {
        return entityManager.find(Permission.class, id);
    }

    @Override
    public Permission save(Permission permission) {
        return entityManager.merge(permission);
    }

    @Override
    public void delete(Permission permission) {
        entityManager.remove(permission);
    }
}
