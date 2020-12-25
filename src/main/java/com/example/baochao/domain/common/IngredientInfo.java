package com.example.baochao.domain.common;

import com.fasterxml.jackson.databind.JsonNode;

public class IngredientInfo {
    private int id;
    private String name;

    public IngredientInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static IngredientInfo parseNode(JsonNode ingredientNode) {
        int id = ingredientNode.get("materialId").asInt();
        String name = ingredientNode.get("name").asText();
        return new IngredientInfo(id, name);
    }
}
