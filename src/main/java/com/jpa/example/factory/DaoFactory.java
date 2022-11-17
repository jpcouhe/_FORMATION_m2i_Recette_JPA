package com.jpa.example.factory;

import com.jpa.example.dao.RecetteJpaCrudDao;
import com.jpa.example.dao.RecipeJpa;
import com.jpa.example.dao.crudDao;

public class DaoFactory {
    private DaoFactory(){}

    public static crudDao<RecipeJpa> getRecipeDao(){
        return new RecetteJpaCrudDao();
    }
}
