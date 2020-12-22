package com.example.baochao.repository.gen.model;

import javax.annotation.Generated;

public class RecipeIngredient {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.recipe_id")
    private Integer recipeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_id")
    private Integer ingredientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_count")
    private Integer ingredientCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.recipe_id")
    public Integer getRecipeId() {
        return recipeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.recipe_id")
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_id")
    public Integer getIngredientId() {
        return ingredientId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_id")
    public void setIngredientId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_count")
    public Integer getIngredientCount() {
        return ingredientCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_ingredient.ingredient_count")
    public void setIngredientCount(Integer ingredientCount) {
        this.ingredientCount = ingredientCount;
    }
}