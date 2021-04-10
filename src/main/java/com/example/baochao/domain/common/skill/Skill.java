package com.example.baochao.domain.common.skill;

import com.example.baochao.domain.common.skill.effect.SkillEffect;
import com.example.baochao.util.DataChecker;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Skill {
    private int skillId;
    private String desc;
    private List<SkillEffect> effect = new ArrayList<>();


    public static Skill parseNode(JsonNode node) {
        Skill skill = new Skill();
        skill.skillId = node.get("skillId").asInt();
        skill.desc = node.get("desc").asText();
        for (JsonNode e : node.get("effect")) {
            skill.effect.add(SkillEffect.parseNode(e));
        }
        DataChecker.checkFields(Skill.class, node);
        return new Skill();
    }
}
