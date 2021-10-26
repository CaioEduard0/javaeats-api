package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.Permission;

import java.util.List;

public interface PermissionRepository {

    List<Permission> findAll();

    Permission find(Long id);

    Permission save(Permission permission);

    void delete(Permission permission);
}
