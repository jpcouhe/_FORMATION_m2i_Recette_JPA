package com.jpa.example.dao.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class IngredientJpa {
    @Id
    @Column(name="Id_ingredient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long recipeId;

    public String name;

    public IngredientJpa(){}

    @ManyToMany
    @JoinTable(
            name = "recipes",
            joinColumns = @JoinColumn(name = "Id_ingredient"),
            inverseJoinColumns = @JoinColumn(name = "Id_recipes")
    )
    private List<RecipeJpa> recipeList = new ArrayList<>();

    public IngredientJpa(long recipeId, String name) {
        this.recipeId = recipeId;
        this.name = name;
    }
}
