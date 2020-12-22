package com.example.baochao.repository.gen.model;

import javax.annotation.Generated;

public class RecipeGuest {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.recipe_id")
    private Integer recipeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.guest_id")
    private Integer guestId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.rune")
    private String rune;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.recipe_id")
    public Integer getRecipeId() {
        return recipeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.recipe_id")
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.guest_id")
    public Integer getGuestId() {
        return guestId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.guest_id")
    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.rune")
    public String getRune() {
        return rune;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: recipe_guest.rune")
    public void setRune(String rune) {
        this.rune = rune;
    }
}