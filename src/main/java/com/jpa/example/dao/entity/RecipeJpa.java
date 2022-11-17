package com.jpa.example.dao.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class RecipeJpa {
    @Id
    @Column(name = "Id_recipes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeId;

    private String name;

    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "ingredients",
            joinColumns = @JoinColumn(name = "Id_recipes"),
            inverseJoinColumns = @JoinColumn(name = "Id_ingredient")
    )
    private List<IngredientJpa> ingredientList = new ArrayList<>();



    public RecipeJpa() {

    }
    public RecipeJpa(long recipeId, String recipeName, String description) {
        this.recipeId = recipeId;
        this.name = recipeName;
        this.description = description;
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IngredientJpa> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<IngredientJpa> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public String toString() {
        return "RecipeJpa{" +
                "recipeId=" + recipeId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
