package com.jpa.example;

import com.jpa.example.utilities.EntityManagerSingleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        EntityManagerFactory em = EntityManagerSingleton.getEntityInstance();
    }
}
