package com.example.baochao.domain.common.skill;

import com.example.baochao.domain.common.ChefInfo;
import com.fasterxml.jackson.databind.JsonNode;

public class SkillInfo {

    public static SkillInfo parseNode(JsonNode skillNode) {
        return new SkillInfo();
    }
}
