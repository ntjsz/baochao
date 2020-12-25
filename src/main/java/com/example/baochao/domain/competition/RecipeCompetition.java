package com.example.baochao.domain.competition;

import java.util.HashMap;
import java.util.Map;

public class RecipeCompetition {
    private int id;
    private int stirfry;
    private int boil;
    private int knife;
    private int fry;
    private int bake;
    private int steam;

    private Map<Integer, Integer> ingredientsMap = new HashMap<>();

    private int price;
    private int countLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStirfry() {
        return stirfry;
    }

    public void setStirfry(int stirfry) {
        this.stirfry = stirfry;
    }

    public int getBoil() {
        return boil;
    }

    public void setBoil(int boil) {
        this.boil = boil;
    }

    public int getKnife() {
        return knife;
    }

    public void setKnife(int knife) {
        this.knife = knife;
    }

    public int getFry() {
        return fry;
    }

    public void setFry(int fry) {
        this.fry = fry;
    }

    public int getBake() {
        return bake;
    }

    public void setBake(int bake) {
        this.bake = bake;
    }

    public int getSteam() {
        return steam;
    }

    public void setSteam(int steam) {
        this.steam = steam;
    }

    public Map<Integer, Integer> getIngredientsMap() {
        return ingredientsMap;
    }

    public void setIngredientsMap(Map<Integer, Integer> ingredientsMap) {
        this.ingredientsMap = ingredientsMap;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountLimit() {
        return countLimit;
    }

    public void setCountLimit(int countLimit) {
        this.countLimit = countLimit;
    }
}
