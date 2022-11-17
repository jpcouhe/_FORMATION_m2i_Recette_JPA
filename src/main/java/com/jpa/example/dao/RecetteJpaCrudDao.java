package com.jpa.example.dao;

import java.util.List;
import java.util.Optional;

public class RecetteJpaCrudDao implements crudDao {

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Optional findById(int id) {
        return Optional.empty();
    }

    @Override
    public Object create(Object element) {
        return null;
    }

    @Override
    public void delete(Object element) {

    }
}
