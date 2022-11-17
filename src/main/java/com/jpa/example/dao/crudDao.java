package com.jpa.example.dao;

import java.util.List;
import java.util.Optional;

public interface crudDao<E> {
    List<E> findAll();
    Optional<E> findById(int id);
    E create(E element);
    void delete(E element);
}
