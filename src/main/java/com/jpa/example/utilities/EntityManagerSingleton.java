package com.jpa.example.utilities;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class EntityManagerSingleton {

    private static EntityManagerFactory ENTITY_INSTANCE;

    private EntityManagerSingleton(){}

    public static EntityManagerFactory getEntityInstance(){
        if(ENTITY_INSTANCE == null){
            ENTITY_INSTANCE = Persistence.createEntityManagerFactory("myPU");
        }
        return ENTITY_INSTANCE;
    }
}
