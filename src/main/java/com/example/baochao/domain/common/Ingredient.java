package com.example.baochao.domain.common;

import com.example.baochao.domain.common.skill.effect.SkillEffect;
import com.example.baochao.util.DataChecker;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class Ingredient {
    private int materialId;
    private String name;
    private String origin;

    public static Ingredient parseNode(JsonNode node) {
        Ingredient ingredient = new Ingredient();
        ingredient.materialId = node.get("materialId").asInt();
        ingredient.name = node.get("name").asText();
        ingredient.origin = node.get("origin").asText();
        DataChecker.checkFields(Ingredient.class, node);
        return ingredient;
    }
}
