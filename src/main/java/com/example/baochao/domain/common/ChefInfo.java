package com.example.baochao.domain.common;

import com.example.baochao.domain.common.skill.SkillInfo;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class ChefInfo {
    private int id;
    private String name;
    private int rarity;

    private CookPropertyMap cookPropertyMap;
    private SkillInfo commonSkill;
    private SkillInfo ultimateSkill;

    private int meat;
    private int fish;
    private int vegetable;

    private String sourceFrom;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    public CookPropertyMap getCookPropertyMap() {
        return cookPropertyMap;
    }

    public SkillInfo getCommonSkill() {
        return commonSkill;
    }

    public SkillInfo getUltimateSkill() {
        return ultimateSkill;
    }

    public int getMeat() {
        return meat;
    }

    public int getFish() {
        return fish;
    }

    public int getVegetable() {
        return vegetable;
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public static ChefInfo parseNode(JsonNode chefNode, Map<Integer, JsonNode> skillRawDataMap) {
        ChefInfo chefInfo = new ChefInfo();
        chefInfo.id = chefNode.get("chefId").asInt();
        chefInfo.name = chefNode.get("name").asText();
        chefInfo.rarity = chefNode.get("rarity").asInt();
        chefInfo.cookPropertyMap = CookPropertyMap.parseNode(chefNode);

        int commonSkillId = chefNode.get("skill").asInt();
        chefInfo.commonSkill = SkillInfo.parseNode(skillRawDataMap.get(commonSkillId));
        int ultimateSkillId = chefNode.get("ultimateSkill").asInt();
        chefInfo.ultimateSkill = SkillInfo.parseNode(skillRawDataMap.get(ultimateSkillId));

        chefInfo.meat = chefNode.get("meat").asInt();
        chefInfo.fish = chefNode.get("fish").asInt();
        chefInfo.vegetable = chefNode.get("veg").asInt();

        chefInfo.sourceFrom = chefNode.get("origin").asText();
        return chefInfo;
    }
}
