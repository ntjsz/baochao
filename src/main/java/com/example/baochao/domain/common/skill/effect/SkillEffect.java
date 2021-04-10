package com.example.baochao.domain.common.skill.effect;

import com.example.baochao.util.DataChecker;
import com.fasterxml.jackson.databind.JsonNode;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SkillEffect {
    private SkillEffectType type;
    private int value;
    private SkillEffectCondition condition;
    private SkillEffectCal cal;
    private int rarity = -1;
    private int tag = -1;

    private static final Set<String> fields = Arrays.stream(SkillEffect.class.getDeclaredFields())
            .map(Field::getName)
            .filter(f -> !"fields".equals(f))
            .collect(Collectors.toSet());

    public static SkillEffect parseNode(JsonNode node) {
        SkillEffect effect = new SkillEffect();
        effect.type = SkillEffectType.from(node.get("type").asText());
        effect.value = node.get("value").asInt();
        effect.condition = SkillEffectCondition.from(node.get("condition").asText());
        if (node.get("cal") != null) {
            effect.cal = SkillEffectCal.from(node.get("cal").asText());
        }
        if (node.get("rarity") != null) {
            effect.rarity = node.get("rarity").asInt();
        }
        if (node.get("tag") != null) {
            effect.tag = node.get("tag").asInt();
        }

        DataChecker.checkFields(SkillEffect.class, node);
        return effect;
    }
}
