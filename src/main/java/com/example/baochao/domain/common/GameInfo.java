package com.example.baochao.domain.common;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Map;

public class GameInfo {

    private Map<Integer, IngredientInfo> ingredients = new HashMap<>();

    private Map<Integer, ChefInfo> chefs = new HashMap<>();

    public void parse(JsonNode documentNode) {
        parseIngredients(documentNode.get("materials"));
        parseChefs(documentNode.get("chefs"), documentNode.get("skills"));
    }

    private void parseIngredients(JsonNode ingredientsNode) {
        for (JsonNode node : ingredientsNode) {
            IngredientInfo info = IngredientInfo.parseNode(node);
            ingredients.put(info.getId(), info);
        }
    }

    private void parseChefs(JsonNode chefsNode, JsonNode skillsNode) {
        Map<Integer, JsonNode> skillRawDataMap = new HashMap<>();
        for (JsonNode node : skillsNode) {
            int skillId = node.get("skillId").asInt();
            skillRawDataMap.put(skillId, node);
        }

        for (JsonNode node : chefsNode) {
            ChefInfo info = ChefInfo.parseNode(node, skillRawDataMap);
            chefs.put(info.getId(), info);
        }
    }
}
