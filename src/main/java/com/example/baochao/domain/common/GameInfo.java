package com.example.baochao.domain.common;

import com.example.baochao.domain.common.skill.Skill;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Map;

public class GameInfo {
    private Map<Integer, Ingredient> ingredients = new HashMap<>();
    private Map<Integer, Skill> skills = new HashMap<>();

    private Map<Integer, ChefInfo> chefs = new HashMap<>();

    public void parse(JsonNode documentNode) {
        parseIngredients(documentNode.get("materials"));
        parseSkills(documentNode.get("skills"));
        //parseChefs(documentNode.get("chefs"), documentNode.get("skills"));
    }

    private void parseIngredients(JsonNode ingredientsNode) {
        for (JsonNode node : ingredientsNode) {
            Ingredient info = Ingredient.parseNode(node);
            ingredients.put(info.getMaterialId(), info);
        }
    }

    private void parseSkills(JsonNode skillsNode) {
        for (JsonNode node : skillsNode) {
            Skill skill = Skill.parseNode(node);
            skills.put(skill.getSkillId(), skill);
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
