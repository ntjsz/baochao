package com.example.baochao.domain.common;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Map;

public class GameInfo {

    private Map<Integer, IngredientInfo> ingredients = new HashMap<>();

    public void parse(JsonNode documentNode) {
        parseIngredients(documentNode.get("materials"));
    }

    private void parseIngredients(JsonNode ingredientsNode) {
        for (JsonNode node : ingredientsNode) {
            IngredientInfo info = IngredientInfo.parseNode(node);
            ingredients.put(info.getId(), info);
        }
    }
}
